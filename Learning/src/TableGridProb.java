import java.awt.*;
import java.lang.reflect.InvocationTargetException;
import javax.swing.*;
import javax.swing.border.LineBorder;


public class TableGridProb {
    public static void main( String[] args ) throws InterruptedException, InvocationTargetException{

        EventQueue.invokeAndWait( new Runnable(){

            @Override
      public void run() {
          JFrame frame = new JFrame( "Table Grid Prob" );
          frame.setSize( 800, 300 );
          frame.setVisible( true );
          JSplitPane split_pane = new JSplitPane();
          JScrollPane split_jsp = new JScrollPane( split_pane );
          JPanel left_panel = new JPanel();
          left_panel.setLayout( new BorderLayout() );
          JTree jt = new JTree();
          jt.setRowHeight( 20 );
          left_panel.add( jt, BorderLayout.WEST );
//        left_panel.add( jt, BorderLayout.EAST );

          JTable jtable = new JTable( 4, 1  );

//        jtable.setBorder( new LineBorder( Color.green, 3 ));

          jtable.setRowHeight( 20 );
          left_panel.add( jtable, BorderLayout.CENTER );
          split_pane.setLeftComponent( left_panel );
          frame.getContentPane().add( split_jsp );
          split_pane.setDividerLocation( 0.5d );

      }
        });
    }
}