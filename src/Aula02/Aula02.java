package Aula02;

public class Aula02 {
    public static void main(String[] args){
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.modelo = "bic";
        c1.status();

        c1.tampar();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.cor = "red";
        c2.modelo = "hostnet";
        c2.status();
        c2.destampar();
        c2.rabiscar();
    }
}
