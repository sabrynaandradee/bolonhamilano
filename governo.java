public class Governo {

    private int dinheiro;
    private int impostoPorHabitante;

    public Governo(int dinheiro, int impostoPorHabitante) {
        this.dinheiro = dinheiro;
        this.impostoPorHabitante = impostoPorHabitante;
    }

    public void cobrarImpostos(Populacao populacao) {
        int imposto = populacao.getHabitantes() * impostoPorHabitante;

        dinheiro += imposto;

        System.out.println("Impostos arrecadados: " + imposto);
        System.out.println("Dinheiro do governo: " + dinheiro);
    }

    public int getDinheiro() {
        return dinheiro;
    }

    public void exibirGoverno() {
        System.out.println("Dinheiro do governo: " + dinheiro);
        System.out.println("Imposto por habitante: " + impostoPorHabitante);
    }
}
