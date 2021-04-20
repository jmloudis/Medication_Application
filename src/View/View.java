/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.ArrayList;
import javax.swing.JTable;

/**
 *
 * @author jordan
 */
public class View
{
    //private mainFrame mainFrame
    private mainPanel mainPanel;
    
    //private medicationFrame medicationFrame;
    
    
    
//    public mainFrame getmainFrame()
//    {
//        return mainFrame;
//    }
//    
//    public void DisplayCenterButton(String s, int position)
//    {
//        // mainFrame.getMainPanel().getCenterPanel().displayBts(s, position);
//        //in the lab, yes, you will need methods in CenterPanel
//        //to display the headers
//        //to display 1-many lines of buttons
//    }

    public View()
    {
//        mainFrame = new mainFrame();
        //medicationFrame = new medicationFrame();
        mainPanel = new mainPanel();
        
    }
    
    
  
//    public mainFrame getMainFrame()
//    {
//        return mainFrame;
//    }
//
//    public void setMainFrame(mainFrame mainFrame)
//    {
//        this.mainFrame = mainFrame;
//    }
    
//    public medicationFrame getMedicationFrame()
//    {
//        return medicationFrame;
//    }
//
//    public void setMedicationFrame(medicationFrame medicationFrame)
//    {
//        this.medicationFrame = medicationFrame;
//    }
    
    
    
    
    
//    public void createButtons(int a, int b)
//    {
//        this.mainFrame.getMainPanel().getCenterPanel().createButtons(a, b);
//    }
//
//    public void updateButtons(ArrayList<String> names)
//    {
//        this.mainFrame.getMainPanel().getCenterPanel().updateButtons(names);
//        
//    }

    public mainPanel getMainPanel()
    {
        return mainPanel;
    }

    public void setMainPanel(mainPanel mainPanel)
    {
        this.mainPanel = mainPanel;
    }

  
    
    
    

    
    
    
    
    
    
}
