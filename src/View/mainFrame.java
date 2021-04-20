/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.UIManager;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author jordan
 */
public class mainFrame extends JFrame 
{
    private JPanel currentPanel;
    
    // private medicationPanel medicationPanel;

    public mainFrame() {
        
        super("Medication Application");
        LayoutSetupMAC();
        
        currentPanel = new JPanel();
        add(currentPanel);
        
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1920, 1080);
        setBackground(Color.LIGHT_GRAY);
        setVisible(true);  
        
    }
    
   

    void LayoutSetupMAC()
    {
        // On some MACs it might be necessary to have the statement below 
        //for the background color of the button to appear    
        try
        {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        //------------------------------------------------------           
    }

    public JPanel getCurrentPanel() {
        return currentPanel;
    }

    public void setCurrentPanel(JPanel inputPanel) {
        this.currentPanel = inputPanel;
    }

    public void updateFrame(JPanel updatePanel) {
        remove(currentPanel);
        this.currentPanel = updatePanel;
        add(currentPanel);
        repaint();
        validate();
    } 
    
}
