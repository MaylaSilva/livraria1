package service;

import model.Livro;

import java.util.ArrayList;
import java.util.List;

public class LivroService {
    private List<Livro> livrosCadastrados = new ArrayList<>();
    private static int sequence = 1;

    private void setId(Livro livro) {
        livro.setId(sequence);
        sequence ++;
    }

    public void adicionarLivro (Livro livro) throws IllegalArgumentException{
        if (livro.getNome() == null){
            throw new IllegalArgumentException("Você precisa informar o nome do livro");
        }
        setId(livro);
        livrosCadastrados.add(livro);
    }
    public void removerLivro (Livro livro){
        livrosCadastrados.remove(livro);
    }
    public List<Livro> listarTodos (){
        return livrosCadastrados;
    }
}
