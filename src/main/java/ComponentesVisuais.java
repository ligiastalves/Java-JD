import javax.swing.*;
import java.awt.*;

public class ComponentesVisuais {

    public static void criarTela() {
        JFrame tela = new JFrame("Hello, Swing!!!");
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //constroi um JLabel
        JLabel helloSwingLabel = new JLabel("Hello, Swing!!!!!!!!!");
        //obtem o painel de conteudo
        Container painelDeConteudo = tela.getContentPane();
        //adiciona o JLabel ao painel de conteudo
        painelDeConteudo.add(helloSwingLabel);

        //ajusta largura e altura da tela conforme seu conteudo
        tela.pack();
        //torna a tela visivel
        tela.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            criarTela();
        });
    }
}
