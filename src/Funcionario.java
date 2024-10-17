public class Funcionario {private Cargo cargo;
    private String sexo;
    private int horasTrabalhadas;


    public Funcionario(Cargo cargo, String sexo, int horasTrabalhadas) {
        this.cargo = cargo;
        this.sexo = sexo;
        this.horasTrabalhadas = horasTrabalhadas;
    }


    public double calcularSalarioFinal() {
        // Calcula o salário base
        double salarioBase = cargo.getValorHoraTrabalhada() * horasTrabalhadas;


        if (sexo.equalsIgnoreCase("F")) {
            salarioBase += salarioBase * 0.20; // Adicional de 20% para sexo feminino
        }
        return salarioBase;
    }


    @Override
    public String toString() {
        return "Funcionario{" +
                "cargo=" + cargo +
                ", sexo='" + sexo + '\'' +
                ", horasTrabalhadas=" + horasTrabalhadas +
                ", salarioFinal=" + calcularSalarioFinal() +
                '}';
    }
}
