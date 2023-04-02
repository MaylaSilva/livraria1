package service;

import model.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioService {
    private List<Usuario> usuariosCadastrados = new ArrayList<>();


    private static int sequence = 1;

    private void setId(Usuario usuario) {
        usuario.setId(sequence);
        sequence ++;
    }
    public void adicionarUsuario (Usuario usuario){
        setId(usuario);
        usuariosCadastrados.add(usuario);
    }
    public void removerUsuario (Usuario usuario){
        usuariosCadastrados.remove(usuario);
    }
    public Usuario localizaPorId (long id){
        for (Usuario usuario : usuariosCadastrados){
            if(usuario.getId() == id){
                return usuario;
            }
        }
        return null;
    }
    public List<Usuario> listarTodos(){
        return usuariosCadastrados;
    }
}