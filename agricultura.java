public class Agricultura {

    private int producao;
    private int alimento;

    public Agricultura() {
        this.producao = 0;
        this.alimento = 0;
    }

    public void produzirAlimentos(int quantidade) {
        if (quantidade > 0) {
            producao += quantidade;
            alimento += quantidade;

            System.out.println("Producao realizada!");
            System.out.println("Alimentos produzidos: " + quantidade);
        } else {
            System.out.println("Quantidade invalida!");
        }
    }

    public int getProducao() {
        return producao;
    }

    public int getAlimento() {
        return alimento;
    }

    public void exibirAgricultura() {
        System.out.println("Producao total: " + producao);
        System.out.println("Alimentos disponiveis: " + alimento);
    }
}