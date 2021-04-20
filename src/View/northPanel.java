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
import javax.swing.*;
import javax.swing.JTextField;
import java.awt.GridLayout;

/**
 *
 * @author jordan
 */


public class northPanel extends JPanel
{
    private JTextField searchText;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    
    public northPanel()
    {  

        JPanel Background = new JPanel();


        JPanel frame = new JPanel(new BorderLayout());

//      Will create a Pop Panel in order to create and add Medications with side effects, quantity, description and timer 
//      to the list

        b1 = new JButton("View Medication");
        b1.setFont(new Font("Courier", Font.PLAIN, 18));
        b1.setBackground(Color.LIGHT_GRAY);
        b1.setForeground(Color.BLACK);
        frame.add(b1);
        add(b1);

        b2 = new JButton("Add Medication");
        b2.setFont(new Font("Courier", Font.PLAIN, 18));
        b2.setBackground(Color.LIGHT_GRAY);
        b2.setForeground(Color.BLACK);
        frame.add(b2);
        add(b2);
        
        b3 = new JButton("Delete Medication");
        b3.setFont(new Font("Courier", Font.PLAIN, 18));
        b3.setBackground(Color.LIGHT_GRAY);
        b3.setForeground(Color.BLACK);
        
        frame.add(b3);
        add(b3);
        
        searchText = new JTextField(20);
        searchText.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        searchText.setText("Search:");

        add(searchText);
    }
    
    public JTextField getSearchText()
    {
        return searchText;
    }

    public void setSearchText(JTextField searchText)
    {
        this.searchText = searchText;
    }

    public JButton getB1()
    {
        return b1;
    }

    public void setB1(JButton b1)
    {
        this.b1 = b1;
    }

    public JButton getB2()
    {
        return b2;
    }

    public void setB2(JButton b2)
    {
        this.b2 = b2;
    }

    public JButton getB3()
    {
        return b3;
    }

    public void setB3(JButton b3)
    {
        this.b3 = b3;
    }

    
}