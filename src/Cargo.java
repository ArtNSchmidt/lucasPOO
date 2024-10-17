public class Cargo {

    private int numeroCargo;
    private double valorHoraTrabalhada;


    public Cargo(int numeroCargo, double valorHoraTrabalhada) {
        this.numeroCargo = numeroCargo;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }


    public int getNumeroCargo() {
        return numeroCargo;
    }

    public double getValorHoraTrabalhada() {
        return valorHoraTrabalhada;
    }


    @Override
    public String toString() {
        return "Cargo{" +
                "numeroCargo=" + numeroCargo +
                ", valorHoraTrabalhada=" + valorHoraTrabalhada +
                '}';
    }
}
