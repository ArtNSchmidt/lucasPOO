public class Main {
    public static void main(String[] args) {
//        Funcionario f1 = new Funcionario("Ana Silva", "Gerente", 5000.00, "Administração", "12345678900", 35);
//        Funcionario f2 = new Funcionario("Carlos Souza", "Atendente", 2500.00, "Atendimento", "98765432100", 28);
//        Funcionario f3 = new Funcionario("Fernanda Lima", "Cozinheira", 3000.00, "Cozinha", "45678912300", 40);
//        Funcionario f4 = new Funcionario("João Pereira", "Auxiliar de Limpeza", 1800.00, "Manutenção", "32165498700", 50);
//        Funcionario f5 = new Funcionario("Paula Gomes", "Caixa", 2200.00, "Financeiro", "65432178900", 30);
//
//        System.out.println(f1);
//        System.out.println(f2);
//        System.out.println(f3);
//        System.out.println(f4);
//        System.out.println(f5);

      //  Elevador elevador = new Elevador(10, 19 ,15,1) ;
        // Instanciando o objeto Elevador
        Elevador elevador = new Elevador(0, 0, 5, 10); // Andar inicial 0, 0 pessoas, capacidade 5, total 10 andares

        // Chamando métodos para testar o elevador
        elevador.entra(); // Entra 1 pessoa
        elevador.entra(); // Entra mais 1 pessoa
        elevador.sobe();  // Sobe 1 andar
        elevador.mostraEstado(); // Mostra o estado atual do elevador

        elevador.sai();   // Sai 1 pessoa
        elevador.sobe();  // Sobe mais 1 andar
        elevador.desce(); // Desce 1 andar
        elevador.mostraEstado(); // Mostra o estado final do elevador
    }
}
