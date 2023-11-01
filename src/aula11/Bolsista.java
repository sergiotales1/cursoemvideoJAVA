package aula11;

public class Bolsista extends Aluno{
    private float bolsa;

    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.getNome());
    }

    @Override
    public void PagarMensalidade(){
        System.out.println(this.getNome() + " eh bolsista, pagamento facilitado!");
    }
}
