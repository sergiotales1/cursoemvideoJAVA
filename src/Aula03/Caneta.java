package Aula03;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status(){
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("A caneta está tampada ? "+ this.tampada);
        System.out.println("Modelo: " + this.modelo);
    }

    protected void tampar(){
        this.tampada = true;
    }

    protected void destampar(){
        this.tampada = false;
    }

   public void rabiscar(){
        if(this.tampada){
            System.out.println("ERRO nâo posso rabiscar!");
        } else {
            System.out.println("Estou rabiscando!");
        }
    }
}


