import java.util.ArrayList;
import java.util.Scanner;

public class Jogo {

    private ArrayList<Jogador> jogadores;

    public Jogo() {
        jogadores = new ArrayList<>();
    }

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public void listarJogadores() {
        System.out.println("\n===== JOGADORES =====");

        for (Jogador jogador : jogadores) {
            jogador.exibirInformacoes();
            System.out.println("-------------------");
        }
    }

    public int getQuantidadeJogadores() {
        return jogadores.size();
    }
}