/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Model;
import View.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author jordan
 */
public class Controller
{
    
    private Model model;
    private View view;
    
    
    public Controller(Model m, View v){
        this.model = m;
        this.view = v;   
        
        //view.createButtons(model.names().size(), 1);
        //view.updateButtons(model.names());
        //view.getMainFrame().getCurrentPanel();
        
        // view.getMainPanel().getTablePanel().getTable().createDefaultColumnsFromModel();
        
        addListeners();
        
//        view.display();

    }

    public Model getModel()
    {
        return model;
    }

    public void setModel(Model model)
    {
        this.model = model;
    }

    public View getView()
    {
        return view;
    }

    public void setView(View view)
    {
        this.view = view;
    }

    private void addListeners()
    {
        
    }
  
            
        
        
    
    
    
    
}
