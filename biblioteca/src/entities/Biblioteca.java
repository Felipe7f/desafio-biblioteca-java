package entities;

import entitiesEnum.CategoriaLivro;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    Livro livro = new Livro();
    CategoriaLivro categoria;
    List<Livro> livros = new ArrayList<>();

    public Biblioteca() {
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void addLivro(Livro livro) {
        livros.add(livro);
    }

    public void removeLivro (String tituloParaRemover) {
        for (int i = 0; i< livros.size(); i++) {
            if (livros.get(i).getTitulo().equalsIgnoreCase(tituloParaRemover)) {
                Livro removido = livros.remove(i);
                System.out.println("Livro removido: " + removido.getTitulo());
                return;
            }
        }
        System.out.println("Livro não encontrado: " + tituloParaRemover);
    }

    public String listarTodosLivros() {
        if (livros.isEmpty()) {
            return "Nenhum livro cadastrado na biblioteca.";
        }

        StringBuilder sb = new StringBuilder("=== TODOS OS LIVROS ===\n");
        for (Livro livro : livros) {
            sb.append("Título: ").append(livro.getTitulo())
                    .append(" | Autor: ").append(livro.getAutor())
                    .append(" | Ano de publicação: ").append(livro.getAnoPublicacao())
                    .append(" | Categoria: ").append(livro.getCategoria())
                    .append(" | Empréstimo: ").append(livro.isDisponivel() ? "Disponível" : "Indisponível")
                    .append("\n");
        }
        return sb.toString();
    }

    public void listarLivrosDisponiveis() {
        StringBuilder sb = new StringBuilder("=== TODOS OS LIVROS DISPONÍVEIS ===\n");
        boolean encontrouDisponivel = false;

        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                sb.append("Título: ").append(livro.getTitulo())
                        .append(" | Autor: ").append(livro.getAutor())
                        .append(" | Ano de publicação: ").append(livro.getAnoPublicacao())
                        .append(" | Categoria: ").append(livro.getCategoria())
                        .append("\n");
                encontrouDisponivel = true;
            }
        }

        if (!encontrouDisponivel) {
            sb.append("Nenhum livro disponível no momento.\n");
        }

        System.out.println(sb.toString());
    }


    public void listarLivrosPorCategoria(CategoriaLivro categoria) {
        StringBuilder sb = new StringBuilder("=== TODOS OS LIVROS DISPONÍVEIS ===\n");

        for (int i = 0; i< livros.size(); i++) {
            Livro livro = livros.get(i);
            if (livro.getCategoria().equals(categoria)) {
                sb.append("Título: ").append(livro.getTitulo())
                        .append(" | Autor: ").append(livro.getAutor())
                        .append(" | Ano de publicação: ").append(livro.getAnoPublicacao())
                        .append(" | Categoria: ").append(livro.getCategoria())
                        .append("\n");
            }
        }
        System.out.println(sb.toString());
    }

    public void emprestarLivro(String titulo) {
        for (int i = 0; i< livros.size(); i++) {
            Livro livro = livros.get(i);
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                if (livro.isDisponivel() == true) {
                    System.out.println("Livro Disponível!");
                    livro.setDisponivel(false);
                    System.out.println("Livro '" + titulo + "' emprestado com sucesso!");
                    return;
                } else {
                    System.out.println("Livro '" + titulo + "' já está emprestado (indisponível)!");
                    return;
                }
            }
        }
        System.out.println("Livro '" + titulo + "' não foi encontrado!");
    }

    public void devolverLivro(String titulo) {
        for (int i = 0; i< livros.size(); i++) {
            Livro livro = livros.get(i);
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                if (livro.isDisponivel() == false) {
                    livro.setDisponivel(true);
                    System.out.println("Livro '" + titulo + "' devolvido com sucesso!");
                    return;
                } else {
                    System.out.println("Livro '" + titulo + "' já está disponível!");
                    return;
                }
            }
        }
        System.out.println("Livro '" + titulo + "' não foi encontrado!");
    }
}
