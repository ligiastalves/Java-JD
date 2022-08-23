import java.util.ArrayList;

public class Composicao {

    //Relacionamento TEM_UM (HAS-A) é feita por meio da especificação
    //de variaveis de instancia

    class Professor {
        private String nome;
        private String titulacao;
        public Professor (String nome, String titulacao){

            this.nome = nome;
            this.titulacao = titulacao;
        }
    }

    class Disciplina{

        private String nome;
        private String descricao;
        public Disciplina(String nome, String descricao){

            this.nome = nome;
            this.descricao = descricao;
        }
    }

    class Atribuicao{
        //Atribuicao TEM-UM Professor
        private Professor professor;
        //Atribuicao TEM-UM Disciplina
        private Disciplina disciplina;
        public Atribuicao (Professor professor, Disciplina disciplina){

            this.professor = professor;
            this.disciplina = disciplina;
        }
    }

    class Universidade{
        //Universidade TEM-UM lista de atribuicoes
        private List atribuicoes = new ArrayList<>();
        public void adicionarAtribuicao (Atribuicao atribuicao){
            this.atribuicoes.add(atribuicao);
        }
    }
    public class TesteAtribuicao{

        public static void main(String [] args){
            Universidade universidade = new Universidade();
            Professor p1 = new Professor("José", "Doutor");
            Professor p2 = new Professor("Maria", "Doutora");
            Disciplina d1 = new Disciplina("Matemática", "Matemática Elementar");
            Disciplina d2 = new Disciplina("Compiladores", "Contrução de compiladores");
            universidade.adicionarAtribuicao(new Atribuicao(p1,d1));
            universidade.adicionarAtribuicao(new Atribuicao(p2, d1));
            universidade.adicionarAtribuicao(new Atribuicao(p2, d2));
        }
    }
}
