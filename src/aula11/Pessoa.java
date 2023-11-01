package aula11;

public abstract class Pessoa {
        private String nome, sexo;
        private int idade;

        public final void fazerAniv(){
            this.idade++;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getSexo() {
            return sexo;
        }

        public void setSexo(String sexo) {
            this.sexo = sexo;
        }

        public int getIdade() {
            return this.idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        @Override
        public String toString() {
            return "Pessoa{" +
                    "nome='" + nome + '\'' +
                    ", sexo='" + sexo + '\'' +
                    ", idade=" + idade +
                    '}';
        }
    }
