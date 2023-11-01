package aula11;

public class aula11 {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        a1.setIdade(29);
        System.out.println(a1.getIdade());
        Bolsista b1 = new Bolsista();
        b1.setNome("Sergio");
        b1.PagarMensalidade();
    }
}
