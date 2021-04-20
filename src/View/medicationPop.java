/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Model.*;

import javax.swing.*;

/**
 *
 * @author jordan
 */
public class medicationPop extends JFrame
{
    private JTextField nameText;
    private JTextField descriptionText;

    private JTextField quantityText;
    
    private JTextField sideEffectsText;

    private JButton createBtn;
    
    
    
    public medicationPop(){
        super();
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(250, 100, 800, 400);

        setLayout(null);

        JLabel name_label = new JLabel("Name :");
        name_label.setBounds(90, 30, 250, 30);

        JLabel description_label = new JLabel("Description :");
        description_label.setBounds(90, 80, 250, 30);

        JLabel tags_label = new JLabel("Quantity :");
        tags_label.setBounds(90, 130, 250, 30);
        
        JLabel sideEffects_label = new JLabel("Side Effects: ");
        sideEffects_label.setBounds(90, 180, 250, 30);

        nameText = new JTextField();
        nameText.setBounds(220, 30, 490, 30);

        descriptionText = new JTextField();
        descriptionText.setBounds(220, 80, 490, 30);

        quantityText = new JTextField();
        quantityText.setBounds(220, 130, 490, 30);
        
        sideEffectsText = new JTextField();
        sideEffectsText.setBounds(220, 180, 490, 30); 

        createBtn = new JButton("Create");
        createBtn.setBounds(350, 280, 100, 30);
        
        add(name_label);
        add(description_label);
        add(tags_label);
        add(sideEffects_label);
        add(nameText);
        add(descriptionText);
        add(quantityText);
        add(sideEffectsText);
        add(createBtn);
        setVisible(true);
        
    }

    public JTextField getNameText()
    {
        return nameText;
    }

    public void setNameText(JTextField nameText)
    {
        this.nameText = nameText;
    }

    public JTextField getDescriptionText()
    {
        return descriptionText;
    }

    public void setDescriptionText(JTextField descriptionText)
    {
        this.descriptionText = descriptionText;
    }
    
    public JTextField getQuantityText()
    {
        return quantityText;
    }

    public void setQuantityText(JTextField quantityText)
    {
        this.quantityText = quantityText;
    }

    public JTextField getSideEffectsText()
    {
        return sideEffectsText;
    }

    public void setSideEffectsText(JTextField sideEffectsText)
    {
        this.sideEffectsText = sideEffectsText;
    }


    public JButton getCreateBtn()
    {
        return createBtn;
    }

    public void setCreateBtn(JButton createBtn)
    {
        this.createBtn = createBtn;
    }

    
    
    
    
}
