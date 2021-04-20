/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author jordan
 */
public class medicationView
{
    private medicationPanel medicationPanel;
    
    public medicationView()
    {
        medicationPanel = new medicationPanel();
    }

    public medicationPanel getMedicationPanel()
    {
        return medicationPanel;
    }

    public void setMedicationPanel(medicationPanel medicationPanel)
    {
        this.medicationPanel = medicationPanel;
    }
    
    
}
