package service;

import model.Livro;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LivroServiceTest {
    LivroService livroService;

    @BeforeEach
    public void inicio(){
        livroService = new LivroService();
    }
    @AfterEach
    public void limpar(){
        livroService.listarTodos().clear();
    }
    @Test
    public void deveAdicionarLivro(){
        //given
        Livro livro = new Livro();
        livro.setNome("1984");
        //when
        livroService.adicionarLivro(livro);
        //then
        assertEquals(1,livroService.listarTodos().size());
    }
    @Test
    public void deveLancarExcecao(){
        //given
        Livro livro = new Livro();
        //when
        IllegalArgumentException lancaexcecao = assertThrows(IllegalArgumentException.class,
                () -> livroService.adicionarLivro(livro));
        //then
        assertEquals("Você precisa informar o nome do livro",lancaexcecao.getMessage());
    }
    @Test
    public void deveRemoverLivro(){
        //given
        Livro livro = new Livro();
        livro.setNome("Battle Royale");
        //when
        livroService.adicionarLivro(livro);
        livroService.removerLivro(livro);
        //then
        assertTrue(livroService.listarTodos().size()==0);
    }
    @Test
    public void deveListarLivros(){
        //given
        Livro livro = new Livro();
        livro.setNome("Brisingr");
        Livro livro1 = new Livro();
        livro1.setNome("Eldest");
        Livro livro2 = new Livro();
        livro2.setNome("Eragon");
        //when
        livroService.adicionarLivro(livro);
        livroService.adicionarLivro(livro1);
        livroService.adicionarLivro(livro2);
        //then
        assertEquals(3,livroService.listarTodos().size());
    }
}
