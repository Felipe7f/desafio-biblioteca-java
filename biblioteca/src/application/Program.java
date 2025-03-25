package application;

import entities.Biblioteca;
import entities.Livro;
import entitiesEnum.CategoriaLivro;

import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        Biblioteca biblioteca = new Biblioteca();
        Livro livro = new Livro();
        CategoriaLivro categoria;

        biblioteca.addLivro(new Livro("1984", "George Orwell", 1949, CategoriaLivro.FICCAO, true));
        biblioteca.addLivro(new Livro("Clean Code", "Robert Martin", 2008, CategoriaLivro.TECNICO, true));

        int opcao;
        do {
            System.out.println();
            System.out.println("----- MENU -----\n");

            System.out.println("Escolha as opções de acordo com oque você quisear:");

            System.out.println("1. Adicionar livro ");
            System.out.println("2. Remover livro  ");
            System.out.println("3. Emprestar livro  ");
            System.out.println("4. Devolver livro ");
            System.out.println("5. Listar todos os livros  ");
            System.out.println("6. Listar livros disponíveis  ");
            System.out.println("7. Listar livros por categoria  ");
            System.out.println("0. Sair ");
            System.out.println();

            System.out.print("Escolha uma das opções: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    adicionarLivro(sc, biblioteca);
                    break;
                case 2:
                    removerLivro(sc, biblioteca);
                    break;
                case 3:
                    emprestarLivro(sc, biblioteca);
                    break;
                case 4:
                    devolverLivro(sc, biblioteca);
                    break;
                case 5:
                    System.out.println(biblioteca.listarTodosLivros());
                    break;
                case 6:
                    biblioteca.listarLivrosDisponiveis();
                    break;
                case 7:
                    listarLivroPorCategoria(sc, biblioteca);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção Indisponivel = " + opcao);
            }
        } while (opcao != 0);

        sc.close();

        System.out.println("Programa Finalizado!");
    }

    public static void adicionarLivro(Scanner sc, Biblioteca biblioteca) {
        System.out.println();
        System.out.print("\nTitulo do livro: ");
        String titulo = sc.nextLine();

        System.out.print("Nome do autor: ");
        String nomeAutor = sc.nextLine();

        System.out.print("Ano de publicação: ");
        int anoPub = sc.nextInt();
        sc.nextLine();

        System.out.print("Categoria do Livro: (Exp = FICCAO, NAO_FICCAO, TECNICO, ROMANCE, INFANTIL) ");
        String categoriaLivro = sc.nextLine();

        Livro livro = new Livro(titulo, nomeAutor, anoPub, CategoriaLivro.valueOf(categoriaLivro), true);
        biblioteca.addLivro(livro);
    }

    public static void removerLivro(Scanner sc, Biblioteca biblioteca) {
        System.out.println();
        System.out.println("Todos os Livros:");
        System.out.println(biblioteca.listarTodosLivros()+ "\n");

        System.out.print("Qual livro você vai querer remover? Digite o Titulo: ");
        String tituloParaRemover = sc.nextLine();

        biblioteca.removeLivro(tituloParaRemover);
    }

    public static void emprestarLivro(Scanner sc, Biblioteca biblioteca) {
        System.out.println();
        System.out.println("Todos os Livros:");
        System.out.println(biblioteca.listarTodosLivros()+ "\n");

        System.out.print("Qual livro o cliente quer? Digite o titulo: ");
        String tituloParaEmprestar = sc.nextLine();

        biblioteca.emprestarLivro(tituloParaEmprestar);
    }

    public static void devolverLivro(Scanner sc, Biblioteca biblioteca) {
        System.out.println();
        System.out.println("Todos os Livros:");
        System.out.println(biblioteca.listarTodosLivros()+ "\n");

        System.out.print("Qual livro o que vai ser devolvido? Digite o titulo: ");
        String tituloParaDevolver = sc.nextLine();

        biblioteca.devolverLivro(tituloParaDevolver);
    }

    public static void listarLivroPorCategoria(Scanner sc, Biblioteca biblioteca) {
        System.out.println();
        System.out.println("Todos os Livros:");
        System.out.println(biblioteca.listarTodosLivros()+ "\n");

        System.out.print("Qual a categoria dos livros desejedos: (Exp = FICCAO, NAO_FICCAO, TECNICO, ROMANCE, INFANTIL) ");
        String categoriaDesejada = sc.next();

        biblioteca.listarLivrosPorCategoria(CategoriaLivro.valueOf(categoriaDesejada));
    }
}
