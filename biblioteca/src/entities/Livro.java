package entities;

import entitiesEnum.CategoriaLivro;

public class Livro {
    private String titulo;
    private String autor;
    private Integer anoPublicacao;
    CategoriaLivro categoria;
    private boolean disponivel;

    public Livro() {
    }

    public Livro(String titulo, String autor, Integer anoPublicacao, CategoriaLivro categoria, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.categoria = categoria;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public CategoriaLivro getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaLivro categoria) {
        this.categoria = categoria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean emprestar) {
        this.disponivel = emprestar;
    }
}
