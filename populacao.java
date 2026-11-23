public class Populacao {

    private int habitantes;

    public Populacao(int habitantes) {
        this.habitantes = habitantes;
    }

    public void aumentarPopulacao(int quantidade) {
        if (quantidade > 0) {
            habitantes += quantidade;
        }
    }

    public void diminuirPopulacao(int quantidade) {
        if (quantidade > 0 && quantidade <= habitantes) {
            habitantes -= quantidade;
        }
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void exibirPopulacao() {
        System.out.println("Populacao: " + habitantes);
    }
}