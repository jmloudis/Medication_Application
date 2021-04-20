/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Model.tableModel;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author jordan
 */
public class tablePanel extends JPanel
{
    private JTable table;
    
    public tablePanel(){
        //setLayout(new FlowLayout());
        //super (new GridLayout(1,0));
        
        String[] columnNames = {"Name", "Description", "Quantity", "Side Effects"};
        //String[] columnNames = {};
        

        Object[][] data = {
            {"Tylenol", "Relieves Headaches", "2", "Tired, bleeding"},
            {"Multi Vitamin", "important vitamins and minerals", "1", "None"},
            
        };
        
       // table = new JTable(new tableModel());
        table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(1080, 580));
        table.setFillsViewportHeight(true);
        
        JScrollPane scrollpane = new JScrollPane(table);
        
        add(scrollpane);
        
        

    }
    
    
    

    public JTable getTable()
    {
        return table;
    }

    public void setTable(JTable table)
    {
        this.table = table;
    }
    
    
    
    
    
    
}
