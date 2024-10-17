public class Conta {
    String cpf;
    int conta;
    float saldo;
    boolean top;

    public void bonCorr() {//bonus correntista
        if (top) {
            float bonus = (10/100) * saldo;
            saldo += bonus;
        }
    }

    // Função saque, retira um valor float do saldo
    public void saque(float valor) {
        if (valor <= saldo) {
            saldo -= valor;  // retira o valor do saldo
        } else {
            System.out.println("Saldo insuficiente.");  //caso nao tenha valor seja superior ao saldo
        }
    }
    public void deposito(float valorAdd){
        saldo += valorAdd;
    }
    public void status(){
        System.out.println("Cpf: " + cpf);
        System.out.println("Numero da conta: " + conta);
        System.out.println("Saldo Disponivel: " + saldo);
    }
}
