import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Catalogo catalogo = new Catalogo();
        int opcao;

        do {
            System.out.println("----Gestão de Catálogo de Discos----");
            System.out.println("1. Cadastrar Disco");
            System.out.println("2. Cadastrar Artista");
            System.out.println("3. Listar Discos");
            System.out.println("4. Editar Disco");
            System.out.println("5. Remover Disco");
            System.out.println("6. Listar Artistas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Título do disco: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ano de lançamento: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();
                    List<String> faixas = new ArrayList<>();
                    System.out.println("Digite as faixas (digite 'fim' para terminar): ");
                    while (true) {
                        String faixa = scanner.nextLine();
                        if (faixa.equalsIgnoreCase("fim")) break;
                        faixas.add(faixa);
                    }
                    catalogo.cadastrarDisco(titulo, ano, faixas);
                    break;

                case 2:
                    System.out.print("Nome do artista: ");
                    String nome = scanner.nextLine();
                    System.out.print("Gênero musical: ");
                    String genero = scanner.nextLine();
                    System.out.print("Título do disco associado: ");
                    String tituloDisco = scanner.nextLine();
                    catalogo.cadastrarArtista(nome, genero, tituloDisco);
                    break;

                case 3:
                    catalogo.listarDiscos();
                    break;

                case 4:
                    System.out.print("Título do disco a ser editado: ");
                    String tituloAtual = scanner.nextLine();
                    System.out.print("Novo título: ");
                    String novoTitulo = scanner.nextLine();
                    System.out.print("Novo ano de lançamento: ");
                    int novoAno = scanner.nextInt();
                    catalogo.editarDisco(tituloAtual, novoTitulo, novoAno);
                    break;

                case 5:
                    System.out.print("Título do disco a ser removido: ");
                    String tituloRemover = scanner.nextLine();
                    catalogo.removerDisco(tituloRemover);
                    break;

                case 6:
                    catalogo.listarArtistas();
                    break;

                case 0:
                    System.out.println("Finalizando sessão...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
