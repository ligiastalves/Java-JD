public interface Contrato {

    interface Veiculo{
        public void acelerar();
    }

    class Fusca implements Veiculo{
        @Override
        public void acelerar(){
            System.out.println("Fusquinha acelerandoooo..... ");
        }
    }
    class Ferrari implements Veiculo{
        @Override
        public void acelerar(){
            System.out.println("Ferrraariiii aceleraaaaaandooooooo.....");
        }
    }
    class Pessoa{
        private Veiculo veiculo;
        public void dirigir(){
            //dar partida
            //soltar o freio de mao
            veiculo.acelerar();
        }
        public void setVeiculo(Veiculo veiculo){
            this.veiculo = veiculo;
        }
    }
    class Contratos{
        public static void main (String[] args){
            Pessoa p = new Pessoa();
            p.setVeiculo(new Fusca());
            p.dirigir();
            p.setVeiculo(new Ferrari());
            p.dirigir();
        }
    }
    /*Uma interface é um contrato entre classes cujo principal
    objetivo é promover o baixo acoplamento para as suas interações.
     */
}
