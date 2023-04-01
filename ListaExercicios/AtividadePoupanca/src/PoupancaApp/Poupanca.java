package PoupancaApp;

public class Poupanca {
    private int anos;
    private double juros;
    private double depositoMensal;

    public Poupanca(int anos, double juros, double depositoMensal) {
        this.anos = anos;
        this.juros = juros / 100;
        this.depositoMensal = depositoMensal;
    }

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros / 100;
    }

    public double getDepositoMensal() {
        return depositoMensal;
    }

    public void setDepositoMensal(double depositoMensal) {
        this.depositoMensal = depositoMensal;
    }

    public double calculaTotal() {
        int numPagamentos = anos * 12;
        double total = 0;
        for (int i = 0; i < numPagamentos; i++) {
            total += depositoMensal;
            total += total * juros;
        }
        return total;
    }
}

