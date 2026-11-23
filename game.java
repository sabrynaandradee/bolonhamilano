import java.util.Scanner;

public class Game {

    public static void startGame() {

        Scanner entrada = new Scanner(System.in);
        Jogo jogo = new Jogo();

        System.out.print("Quantos jogadores vao participar? ");
        int quantidade = entrada.nextInt();
        entrada.nextLine();

        for (int i = 0; i < quantidade; i++) {

            System.out.println("\nJogador " + (i + 1));

            System.out.print("Nome: ");
            String nome = entrada.nextLine();

            System.out.print("Nome da cidade: ");
            String nomeCidade = entrada.nextLine();

            Cidade cidade = new Cidade(nomeCidade);
            Jogador jogador = new Jogador(nome, cidade);

            jogo.adicionarJogador(jogador);
        }

        jogo.listarJogadores();

        Rodada rodada = new Rodada(5);

        while (!rodada.jogoFinalizado()) {
            System.out.println("\nRodada " + rodada.getNumero());
            rodada.avancarRodada();
        }

        System.out.println("\nFim do jogo!");
    }
}