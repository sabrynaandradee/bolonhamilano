import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n===== BOLONHA E MILANO =====");
            System.out.println("1 - Jogar");
            System.out.println("2 - Como jogar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Iniciando o jogo Bolonha e Milano...");
                    break;
                case 2:
                    System.out.println("O objetivo e administrar sua cidade e vencer o jogo!");
                    break;
                case 0:
                    System.out.println("Encerrando o jogo. Ate mais!");
                    break;
                default:
                    System.out.println("Opcao invalida! Tente novamente.");
            }

        } while (opcao != 0);

        entrada.close();
    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n===== BOLONHA E MILANO =====");
            System.out.println("1 - Jogar");
            System.out.println("2 - Como jogar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    Game.startGame();
                    break;

                case 2:
                    System.out.println("Administre sua cidade e tente vencer!");
                    break;

                case 0:
                    System.out.println("Encerrando o jogo!");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }

        } while (opcao != 0);

        entrada.close();
    }
}