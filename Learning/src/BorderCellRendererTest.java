/*
 *  BorderCellRendererTest.java
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
/**
 *  $Source$ <br>
 *  Last modified: $Date$ <br>
 *  $Revision$ <br>
 *
 *
 * @author    chantal
 */
public class BorderCellRendererTest
{
private JFrame f = null;
 
public static void main( String[] args )
{
new BorderCellRendererTest();
}
 
public BorderCellRendererTest()
{
initComponents();
}
 
private void initComponents()
{
f = new JFrame( "JOptionPaneTest - dummy frame" );
f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
final Container content = f.getContentPane();
content.setLayout( new BorderLayout() );
final Object[] row1 = new Object[]{"row1col1", "row1col2", "row1col2"};
final Object[] row2 = new Object[]{"row2col1", "row2col2", "row2col2"};
final Object[][] data = new Object[][]{row1, row2};
final Object[] cols = new Object[]{"header1", "header2", "header3"};
final JTable table = new JTable(data, cols);
table.setDefaultRenderer(Object.class, new BorderTableCellRenderer());
JScrollPane pane = new JScrollPane(table);
pane.getViewport().setPreferredSize(new Dimension(300,100));
content.add(pane, BorderLayout.CENTER);
f.pack();
// works only with > 1.4
f.setLocationRelativeTo( null );
// end > 1.4
f.setVisible( true );
}
 
public class BorderTableCellRenderer extends JLabel implements TableCellRenderer
{
public BorderTableCellRenderer()
{
super();
this.setBorder( BorderFactory.createEmptyBorder( 1, 10, 1, 10 ) );
}
 
public Component getTableCellRendererComponent( JTable table, Object value,
boolean isSelected, boolean hasFocus, int row, int column )
{
setForeground( table.getForeground() );
setFont( table.getFont() );
setValue( value );
return this;
}
 
public void updateUI()
{
super.updateUI();
setForeground( null );
}
 
public void validate() { }
 
public void revalidate() { }
 
public void repaint( long tm, int x, int y, int width, int height ) { }
 
public void repaint( Rectangle r ) { }
 
public void firePropertyChange( String propertyName, boolean oldValue, boolean newValue ) { }
 
protected void setValue( Object value )
{
setText( ( value == null ) ? "" : value.toString() );
}
 
protected void firePropertyChange( String propertyName, Object oldValue, Object newValue )
{
// Strings get interned...
if ( propertyName == "text" )
{
super.firePropertyChange( propertyName, oldValue, newValue );
}
}
}
}