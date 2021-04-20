/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Model;
import Model.medicationModel;
import Model.tableModel;
import View.medicationView;

import javax.swing.*;
import java.awt.*;


/**
 *
 * @author jordan
 */
public class MedicationController
{
    private medicationView medicationView;
    private medicationModel medicationModel;
    
    private tableModel table;
    
    
    
    public MedicationController()
    {
        
        
    }

    public MedicationController(medicationModel medicationModel, medicationView medicationView)
    {
        this.medicationView = medicationView;
        this.medicationModel = medicationModel;
        
        //view.createButtons(model.names().size(), 1);
        //medicationView.getMedicationPanel().getMedicationCenterPanel().createButtons(1, 1);
        //view.updateButtons(model.names());
        //view.getMainFrame().getCurrentPanel();
        
        
        
        
        addListeners();

    }

    public medicationView getMedicationView()
    {
        return medicationView;
    }

    public void setMedicationView(medicationView medicationView)
    {
        this.medicationView = medicationView;
    }

    public medicationModel getMedicationModel()
    {
        return medicationModel;
    }

    public void setMedicationModel(medicationModel medicationModel)
    {
        this.medicationModel = medicationModel;
        
    }
    
    private void addListeners()
    {
       
        
    }
    
    
    
}
