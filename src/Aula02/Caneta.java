package Aula02;
public class Caneta {
    public String modelo;
    public String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("A caneta está tampada ? "+ this.tampada);
        System.out.println("Modelo: " + this.modelo);
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }

    void rabiscar(){
        if(this.tampada){
            System.out.println("ERRO nâo posso rabiscar!");
        } else {
            System.out.println("Estou rabiscando!");
        }
    }
}


