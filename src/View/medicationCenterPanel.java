/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author jordan
 */
public class medicationCenterPanel extends JPanel
{
    private JTextField nameText;
    private JTextField descriptionText;
    private JTextField quantityText;
    
    public medicationCenterPanel()
    {
        super();
        setLayout(new GridBagLayout());
        
        JLabel name_label = new JLabel("Recipe Name :");
        name_label.setBounds(200, 200, 200, 200);

        JLabel description_label = new JLabel("Description :");
        description_label.setBounds(90, 80, 250, 30);

        JLabel quantity_label = new JLabel("Ingredients :");
        quantity_label.setBounds(90, 130, 250, 30);
        
        JLabel side_label = new JLabel("Side Effects : ");
        side_label.setBounds(90, 180, 250, 30);
        
        nameText = new JTextField();
        nameText.setBounds(220, 230, 490, 30);
        
        add(name_label);
        add(description_label);
        add(quantity_label);
        add(side_label);
        add(nameText);
        
        
    }
    
    
        //every time you create and add buttons outside the constructor
        // you force the screen to refreshed
        
    
    
    
    
    
}
