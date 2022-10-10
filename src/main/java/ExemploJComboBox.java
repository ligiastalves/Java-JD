import javax.swing.*;

public class ExemploJComboBox {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
           String[] dados = {"banana", "Laranja", "Uva", "Pessego"};
           JComboBox menu = new JComboBox<>(dados);
           JFrame tela = new JFrame("Exemplo de JComboBox");
           tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           tela.getContentPane().add(menu);
           tela.pack();
           tela.setLocationRelativeTo(null);
           tela.setVisible(true);
        });
    }
}
