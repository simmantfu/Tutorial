import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class TableHeaderBug extends JFrame {

    private JTable jTable = new JTable();
    private JScrollPane jscpScroll;

    public TableHeaderBug() {
        jTable.setModel(new MyTableModel());
        jTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jscpScroll = new JScrollPane(jTable);
        // Manually set preferred size of header...
        jTable.getTableHeader().setPreferredSize(
            new Dimension(jTable.getSize().width, 40)
        );
        setContentPane(jscpScroll);
        setSize(640, 480);
        setVisible(true);
    }

    public static void main(String[] args) {
       for(int i = 0;true;i++)
    	   System.out.println("hello");
    }

}

class MyTableModel extends AbstractTableModel {

    public int getRowCount() { return 100; }
    public int getColumnCount() { return 8; }
    public Object getValueAt(int r, int c) {
        return new Integer((r+1)*(c+1));
    }
    public String getColumnName(int c) {
        return "times by "+(c+1);
    }
}
