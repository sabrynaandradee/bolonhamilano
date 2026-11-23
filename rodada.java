public class Rodada {

    private int numero;
    private final int limiteRodadas;

    public Rodada(int limiteRodadas) {
        this.numero = 1;
        this.limiteRodadas = limiteRodadas;
    }

    public void avancarRodada() {
        if (numero < limiteRodadas) {
            numero++;
            System.out.println("Rodada atual: " + numero);
        } else {
            System.out.println("O jogo chegou ao fim!");
        }
    }

    public int getNumero() {
        return numero;
    }

    public boolean jogoFinalizado() {
        return numero >= limiteRodadas;
    }
}