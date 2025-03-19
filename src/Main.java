import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Produto {
    int codigo;
    String nome;
    double preco;

    Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    void exibirInformacao() {
        System.out.println("Código: " + codigo + " | Nome: " + nome + " | Preço: " + preco);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Produto> produtos = new HashMap<>();

        int opcao;
        int codigo;
        double preco;
        int buscaCodigo;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Buscar produto por código");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o código do produto: ");
                    codigo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    preco = scanner.nextDouble();
                    produtos.put(codigo, new Produto(codigo, nome, preco));
                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o código do produto: ");
                    buscaCodigo = scanner.nextInt();

                    if (produtos.containsKey(buscaCodigo)) {
                        produtos.get(buscaCodigo).exibirInformacao();
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("           _ _   \n" +
                            "          (_) |  \n" +
                            "  _____  ___| |_ \n" +
                            " / _ \\ \\/ / | __|\n" +
                            "|  __/>  <| | |_ \n" +
                            " \\___/_/\\_\\_|\\__|");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }
}
