/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.*;
import javax.swing.JPanel;

/**
 *
 * @author jordan
 */
public class medicationPanel extends JPanel
{
    private medicationCenterPanel medicationCenterPanel;
    private medicationNorthPanel medicationNorthPanel;

    public medicationPanel()
    {
        super();
        medicationCenterPanel = new medicationCenterPanel();
        medicationNorthPanel = new medicationNorthPanel();
        this.setLayout(new BorderLayout(20,20));
        add(medicationCenterPanel, BorderLayout.CENTER);
        add(medicationNorthPanel, BorderLayout.NORTH);
    }

    public medicationCenterPanel getMedicationCenterPanel()
    {
        return medicationCenterPanel;
    }

    public void setMedicationCenterPanel(medicationCenterPanel medicationCenterPanel)
    {
        this.medicationCenterPanel = medicationCenterPanel;
    }

    public medicationNorthPanel getMedicationNorthPanel()
    {
        return medicationNorthPanel;
    }

    public void setMedicationNorthPanel(medicationNorthPanel medicationNorthPanel)
    {
        this.medicationNorthPanel = medicationNorthPanel;
    }
    
    
     
    
    
}
