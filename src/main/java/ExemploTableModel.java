import javax.swing.table.AbstractTableModel;

public class ExemploTableModel extends AbstractTableModel {

    public ExemploTableModel(Object[][] dados2, String[] colunas2) {
        this.dados2 = dados2;
        this.colunas2 = colunas2;
    }

    private Object[][] dados2;
    String[] colunas2;

    @Override
    public int getRowCount() {
        return dados2.length;
    }

    @Override
    public int getColumnCount() {
        return colunas2.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return dados2[rowIndex][columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return getValueAt(0, columnIndex).getClass();
    }

}