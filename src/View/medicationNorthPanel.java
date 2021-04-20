/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author jordan
 */
public class medicationNorthPanel extends JPanel
{
    private JButton b1;
    
    public medicationNorthPanel(){
        JPanel Background = new JPanel();


        JPanel frame = new JPanel(new BorderLayout());
        
        b1 = new JButton("Back");
        b1.setFont(new Font("Courier", Font.PLAIN, 18));
        b1.setBackground(Color.LIGHT_GRAY);
        b1.setForeground(Color.BLACK);
        frame.add(b1);
        add(b1);

        
    }

    public JButton getB1()
    {
        return b1;
    }

    public void setB1(JButton b1)
    {
        this.b1 = b1;
    }
    
    
    
    
    
}
