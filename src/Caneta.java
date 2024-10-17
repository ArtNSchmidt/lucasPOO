public class Caneta {
   public String modelo;
   private float ponta;
   public String cor;
   protected boolean tampada;
   protected int carga;
   //metodos
    void status() {
        System.out.println("Qual é a cor da caneta?" + this.cor);
        System.out.println("Está tampada?" + this.tampada);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Modelo: " + this.modelo);
    }
    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Erro! Não posso rabiscar");
        } else {
            System.out.println("Estou Rabiscando");
        }
    }
        void tampar () {
            this.tampada = true;
        }
        void destampar () {
            this.tampada = false;
        }
    }

