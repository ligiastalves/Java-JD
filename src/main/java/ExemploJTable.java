import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ExemploJTable {

    public static void main(String[] args) {
        String[] colunas = {"Jose", "Pedro", "Maria"};
        Object[][] dados = {{10,8,9}, {10,10,10}, {7,7,8}};
        SwingUtilities.invokeLater(()->{
            JFrame tela = new JFrame("Exemplo de Tabela Simples");
            DefaultTableModel modelo = new DefaultTableModel(dados,colunas);
            JTable tabela = new JTable(modelo);
            tela.getContentPane().add(new JScrollPane(tabela));
            tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            tela.pack();
            tela.setLocationRelativeTo(null);
            tela.setVisible(true);
        });
    }
}
