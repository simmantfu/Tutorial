import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;    
public class TableExample extends JTable {    
    JFrame f;    
    TableExample(){    
    f=new JFrame();    
    String data[][]={ {"101","Amit","670000"},    
                          {"102","Jai","780000"},    
                          {"101","Sachin","700000"}};    
    String column[]={"ID","NAME","SALARY"};         
    JTable jt=new JTable(data,column);    
    //jt.setBounds(30,40,200,300);  
   JTable j = jt.getTableHeader().getTable();
   //String str = jt.getTableHeader().get
   System.out.println(j.setcol);
    jt.setIntercellSpacing(new Dimension(10,10));
    getTableHeader().setResizingAllowed(false);
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(300,400);    
    f.setVisible(true);    
}     
public static void main(String[] args) {    
    new TableExample();    
}    
}