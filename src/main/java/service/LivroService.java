package service;

import model.Livro;
import model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class LivroService {
    private List<Livro> livrosCadastrados = new ArrayList<>();
    private List<Usuario> compradores = new ArrayList<>();
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
    public void associarLivroAoUsuario(Livro livro, Usuario usuario) {
        compradores.add(usuario);
        livro.setCompradores(compradores);
    }
//    public void desassociarLivroDoUsuario(Livro livro, Usuario usuario) {
//        compradores = livro.getCompradores();
//        if (compradores != null) {
//            compradores.remove(usuario);
//            livro.setCompradores(compradores);
//        }
//    } Me batendo muito pra fazer um teste. Vai ficar para o futuro
}
