public class TipoDeRetorno {

    public static void main (String[] args){

        int x = 2, y = 3, w= 4, z = 5;
        int resultado1 = soma(x,y);
        int resultado2 = soma(w,z);

        System.out.println(resultado1);
        System.out.println(resultado2);
    }
    /* Ao inves de simplesmente exibir cada resultado, ele devolve
    cada um deles para o metodo main que, por sua vez,
    decide exibi-los no console.
     */
    static int soma(int a, int b){

        int resultado = a + b;
        return resultado;
        /*palavra chave return, usada pelo metodo soma para especificar o que ele deseja entregar
        para o metodo main qndo termina a sua execução, neste caso ele deseja entregar
        o valor que esta armazenado na variavel resultado. Note que o seu tipo de retorno é int
        e que essa palavra tomou o lugar da palavra void. É importante que a expressão que aparece
        à frente da palavra return (resultado, neste caso) resulte em um valor compatível com o tipo
        de retorno do método. Por exemplo, um método cujo tipo de retorno é int não pode devolver uma String.
        */
    }
}
