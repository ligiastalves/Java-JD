public class Heranca {

    //Herança, nome bastante utilizado para o relacionamento É-UM em classes (IS-A)
    class Pessoa {
        private String primeiroNome;
        private String sobrenome;
        private String endereco;
        private int idade;
        private String rg;
        private String cpf;
        private char sexo;

    }

    class Professor extends Pessoa{
        private int matricula;
    }

    class Aluno extends Pessoa{
        private int ra;
    }
}