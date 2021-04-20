/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author jordan
 */

// Not in use for this version of the project

public class centerPanel extends JPanel
{
    
    private ArrayList<JButton> jbs;
    
    private int lines;
    private int columns;

    

    public centerPanel()
    {
        super();
        jbs = new ArrayList<JButton>();
        lines = 0;
        columns = 0;

    }
    
    //createHeaders

    public void createButtons(int l, int c)
    {
        GridLayout gr = new GridLayout(l, c);
        setLayout(gr);

        for (int li = 0; li < l; li++)//5
        {
            for (int co = 0; co < c; co++)//3
            {
                JButton b1 = new JButton(li + " " + co);
                b1.setFont(new Font("Courier", Font.PLAIN, 14));
                b1.setBackground(Color.LIGHT_GRAY);
                b1.setForeground(Color.black);
                jbs.add(b1);//add the button to the array of buttons
                add(b1); //add the button to the screen
            }
        }
        //every time you create and add buttons outside the constructor
        // you force the screen to refreshed
        validate();
        repaint();
    }
    
    
    public void updateButtons(ArrayList<String> n)
    {
        for (int l = 0; l < n.size(); l++)
        {
            jbs.get(l).setText(n.get(l));
        }
    }

    public void displayBts(String s, int n)
    {
        jbs.get(n).setText(s);
    }

    public ArrayList<JButton> getJbs()
    {
        return jbs;
    }

    public void setJbs(ArrayList<JButton> jbs)
    {
        this.jbs = jbs;
    }


}
