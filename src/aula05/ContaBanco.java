package aula05;

public class ContaBanco {
    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }

    // property
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void setNumConta(int n){
        this.numConta = n;
    }

    public int getNumConta(){
        return this.numConta;
    }

    public void setTipo(String t){
        this.tipo = t;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setDono(String d){
        this.dono = d;
    }

    public String getDono(){
        return this.dono;
    }

    public void setSaldo(float s){
        this.saldo = s;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public void setStatus(boolean s){
        this.status = s;
    }

    public boolean getStatus(){
        return this.status;
    }

    // methods
    public void estadoAtual(){
        System.out.println("---------------------------");
        System.out.println("Conta: "+ this.getNumConta());
        System.out.println("Tipo: "+ this.getTipo());
        System.out.println("Dono: "+ this.getDono());
        System.out.println("Saldo: "+ this.getSaldo());
        System.out.println("Status: "+ this.getStatus());
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(t.equals("CC")) {
            this.setSaldo(50f);
        } else if(t.equals("CP")){
            this.setSaldo(150f);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta(){
        if(this.saldo > 0){
            System.out.println("Error - Conta ainda possui saldo");
        } else if (this.saldo < 0){
            System.out.println("Error - Conta em débito");
        } else if(this.saldo == 0) {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");

        }
    }

    public void depositar(float v){
        if(this.status){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado com sucesso na conta de "+this.getDono());
        } else {
            System.out.println("Impossivel depositar em uma acc fechada");
        }
    }

    public void sacar(float v){
        if(this.status && this.getSaldo() >= v ){
            this.setSaldo(this.getSaldo() - v);
        } else {
            System.out.println("Impossivel sacar"+ this.getSaldo());

        }
    }

    public void pagarMensal(){
        int v = 0;
        if(this.getTipo().equals("CC")){
            v = 12;
        } else if (this.getTipo().equals("CP")){
            v = 20;
        }
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga por: " + this.getDono());
        } else {
            System.out.println("Impossivel pagar uma conta fechada");
        }
    }

}
