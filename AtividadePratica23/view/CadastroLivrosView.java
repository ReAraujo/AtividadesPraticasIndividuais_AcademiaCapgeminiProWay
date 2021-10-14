package view;

import java.util.Scanner;

import controller.LivroController;
import model.Livro;

public class CadastroLivrosView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LivroController controller = new LivroController();
        int opcaoEscolhida;
        
        cabeçalho();

        do{
            opcaoEscolhida = menu(sc);
            switch(opcaoEscolhida){
                case 1: 
                        cadastrar(sc, controller);   
                break;
                case 2:
                        listar(controller);
                break;
                case 3:
                break;
                case 4:
                break;
                case 0:
                break;
            }
        }while(opcaoEscolhida != 0);


    }

    private static void listar(LivroController controller){
        ArrayList<Livro> listaLivros = controller.listar();
        for (Livro livro : listaLivros) {
            System.out.println("\nTitulo: %s - Autor: %s - Editora: %s - Categoria: %s ");
        }
    }

    private static void cadastrar(Scanner sc, LivroController controller) {
        Livro livro1 = new Livro(0);
        System.out.print("Digite o título do livro: ");
        livro1.setTitulo(sc.nextLine());
        System.out.print("Digite o/(os) autores: ");
        livro1.setAutor(sc.nextLine());
        System.out.print("Digite a editora: ");
        livro1.setEditora(sc.nextLine());
        System.out.print("Digite a categoria: ");
        livro1.setCategoria(sc.nextLine());
        controller.salvar(livro1);
    }

    private static int menu(Scanner sc) {
        System.out.println("\nMenu de Opções:");
        System.out.println("\n\t1 - Cadastrar\n\t2 - Listar\n\t3 - Alterar\n\t4 - Deletar\n\t0 - Sair");
        int opcaoEscolhida = Integer.parseInt(sc.nextLine());
        return opcaoEscolhida;
    }

    private static void cabeçalho() {
        System.out.println("\n===============  Sistema de Cadastro de Livros  ===============");
        System.out.println("\t==========     Seja bem-vindo(a)!     ==========");
    }
    
}
