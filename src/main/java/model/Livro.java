package model;

import java.util.List;

public class Livro {
    private long id;
    private String nome;
    private String autor;
    private List<Usuario> compradores;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public List<Usuario> getCompradores() {
        return compradores;
    }

    public void setCompradores(List<Usuario> compradores) {
        this.compradores = compradores;
    }

    public Livro() {
    }
}
