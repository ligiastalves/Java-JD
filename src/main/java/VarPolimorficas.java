import java.util.ArrayList;
import java.util.List;

public class VarPolimorficas {

    //Uma variável polimórfica é uma variável de referência capaz de referenciar
    // diferentes (múltiplos, daí o seu nome) tipos de objetos.
    static class Animal{
        public void fazerBarulho(){
            System.out.println("Animal fazendo barulho");
        }
    }
    class Gato extends Animal{
        public void fazerBarulho(){
            System.out.println("Miau");
        }
    }
    class Cachorro extends Animal{
        public void fazerBarulho(){
            System.out.println("Au Au");
        }
    }
    public class Polimorfismo{
        public void main(String[] args){
            List animais = new ArrayList<>();
            animais.add(new Gato());
            animais.add(new Gato());
            animais.add(new Cachorro());
            for (Animal animal : animais)
            //polimorfismo dinamico aqui
            //em tempo de execucao, a JVM decide qual
            //metodo chamar em funcao do tipo do objeto
            animal.fazerBarulho();

        }
    }
}
