public class Pessoa {
                                    // Atributos da classe Pessoa
    private String nome;
    private int anoNascimento;
    private double peso; // em kg
    private double altura; // em metros

                                    // Construtor da classe Pessoa
    public Pessoa(String nome, int anoNascimento, double peso, double altura) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.peso = peso;
        this.altura = altura;
    }

                                    // Método para calcular o IMC (Índice de Massa Corporal)
    public double calcularIMC() {
        return peso / (altura * altura);
    }

                                     // Método para calcular a idade da pessoa
    public int calcularIdade(int anoAtual) {
        return anoAtual - anoNascimento;
    }

                                    // Método para calcular a quantidade de água que a pessoa deve beber por dia (aproximadamente 35ml por kg)
    public double calcularAguaNecessaria() {
        return peso * 0.035;
    }

                                      // Método para mostrar informações da pessoa
    public void mostra() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Nascimento: " + anoNascimento);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("IMC: " + String.format("%.2f", calcularIMC()));
        System.out.println("Quantidade de água necessária por dia: " + String.format("%.2f", calcularAguaNecessaria()) + " litros");
    }

                                         // Método principal para testar a classe
    public static void main(String[] args) {
        // Criando uma nova pessoa
        Pessoa p = new Pessoa("João", 1990, 70, 1.75);

        // Mostrando as informações da pessoa
        p.mostra();

        // Exibindo a idade da pessoa
        int idade = p.calcularIdade(2024);
        System.out.println("Idade: " + idade + " anos");
    }
}
