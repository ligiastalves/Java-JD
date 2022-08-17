import javax.swing.JOptionPane;

public class ListaDeParamentros {

    public static void main (String[] args){

        int x= 2, y =3;
        soma(x,y);
    }
    /*metodo main envia valores para o metodo soma que sao
    recebidos por ele na sua lista de parametros
     */
    public static void soma (int a, int b){

        int resultado = a + b;
        JOptionPane.showMessageDialog(null, resultado);
    }

}
