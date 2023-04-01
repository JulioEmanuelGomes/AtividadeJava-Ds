package PoupancaApp;

public class Investimento {
    private int anos;
    private double jurosMensais;
    private double depositoMensal;

    public Investimento(int anos, double jurosMensais, double depositoMensal) {
        this.anos = anos;
        this.jurosMensais = jurosMensais;
        this.depositoMensal = depositoMensal;
    }

    public double calculaTotal() {
        int numPagamentos = anos * 12;
        double total = 0;
        for (int i = 0; i < numPagamentos; i++) {
            total += depositoMensal;
            total += total * jurosMensais;
        }
        return total;
    }
}

