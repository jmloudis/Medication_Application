/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author jordan
 */
public class mainPanel extends JPanel
{
    
    
    private northPanel northPanel;
    private centerPanel centerPanel;
    private tablePanel tablePanel;
    
    
    public mainPanel(){
        
    
            
        super();
        northPanel = new northPanel();
        //centerPanel = new centerPanel();
        tablePanel = new tablePanel();
        this.setLayout(new BorderLayout(20,20));

        add(northPanel, BorderLayout.NORTH);
        //add(centerPanel, BorderLayout.CENTER);
        add(tablePanel, BorderLayout.CENTER);

        
    }

    public northPanel getNorthPanel()
    {
        return northPanel;
    }

    public void setNorthPanel(northPanel northPanel)
    {
        this.northPanel = northPanel;
    }

    public centerPanel getCenterPanel()
    {
        return centerPanel;
    }

    public void setCenterPanel(centerPanel centerPanel)
    {
        this.centerPanel = centerPanel;
    }

    public tablePanel getTablePanel()
    {
        return tablePanel;
    }

    public void setTablePanel(tablePanel tablePanel)
    {
        this.tablePanel = tablePanel;
    }
    
    
    
    
    
    
    
    

    
}
