public class Elevador {
    private int quantidadeAtual;
    private int capacidade;
    private int totalAndares;
    private int andarAtual;

    public Elevador(int andarAtual, int quantidadeAtual, int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.quantidadeAtual = quantidadeAtual;
        this.totalAndares = totalAndares;
        this.andarAtual = andarAtual;
    }

    public int entra() {
        return quantidadeAtual++;
    }

    public int sai() {
        return quantidadeAtual--;
    }

    public int sobe() {
        if (andarAtual == totalAndares) {
            System.out.println("Erro o elevador esta no ultimo andar!");
            return andarAtual;
        } else {
            return andarAtual++;
        }
    }

        public int desce (){
            if (andarAtual == 0) {
                System.out.println("Erro, o elevador esta no terreo!");
                return andarAtual;
            } else {
                return andarAtual--;
            }
        }
    public void mostraEstado() {
        System.out.println("Andar atual: " + andarAtual);
        System.out.println("Quantidade de pessoas: " + quantidadeAtual);
        System.out.println("Capacidade do elevador: " + capacidade);
        System.out.println("Total de andares: " + totalAndares);
    }




}