package service;

import model.Livro;
import model.Usuario;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class UsuarioServiceTest {
    UsuarioService usuarioService;
    @BeforeEach
    public void inicio(){
        usuarioService = new UsuarioService();
    }
    @AfterEach
    public void limpar (){
        usuarioService.listarTodos().clear();
    }
    @Test
    public void deveAdicionarCorretamente(){
        //given
        Usuario usuario = new Usuario();
        //when
        usuarioService.adicionarUsuario(usuario);
        //then
        assertEquals(1,usuarioService.listarTodos().size());
    }
    @Test
    public void deveRemoverCorretamente(){
        //given
        Usuario usuario = new Usuario();
        //when
        usuarioService.adicionarUsuario(usuario);
        usuarioService.removerUsuario(usuario);
        //then
        assertTrue(usuarioService.listarTodos().size()==0);
    }
    @Test
    public void deveListarTodos(){
        //given
        Usuario usuario = new Usuario();
        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario();
        //when
        usuarioService.adicionarUsuario(usuario);
        usuarioService.adicionarUsuario(usuario1);
        usuarioService.adicionarUsuario(usuario2);
        //then
        assertEquals(3,usuarioService.listarTodos().size());
    }
    @Test
    public void deveLocalizarPorId(){
        //given
        Usuario usuario = new Usuario();
        //when
        usuarioService.adicionarUsuario(usuario);
        Usuario usuarioLocalizado = usuarioService.localizaPorId(usuario.getId());
        //then
        assertEquals(usuario,usuarioLocalizado);
    }
    @Test
    public void deveRetornarNullNaPesquisaPorId(){
        //given
        Usuario usuario = new Usuario();
        //when
        usuarioService.adicionarUsuario(usuario);
        Usuario usuarioLocalizado = usuarioService.localizaPorId(9);
        //then
        assertNull(usuarioLocalizado);
    }


}
