/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Medication;
import Model.Model;
import Model.medicationModel;
import Model.navigationModel;
import Model.tableModel;
import View.View;
import View.medicationPop;
import View.medicationView;
import View.navigationView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author jordan
 */
public class NavigationController
{
    
    
    private navigationModel navigationModel;
    private navigationView navigationView;
    
    private Controller Controller;
    private View View;
    private Model Model;
    
    private MedicationController MedicationController;
    private medicationView medicationView;
    private medicationModel medicationModel;
    private medicationPop medicationPop;
    
    private tableModel table;
            
    
    public NavigationController() {
    }
    
    public NavigationController(navigationModel navigationModel, navigationView navigationView) {
        this.navigationModel = navigationModel;
        this.navigationView = navigationView;
        
        Model = new Model();
        View = new View();
        Controller = new Controller(Model, View);
        //navigationView.getMainFrame().updateFrame(Controller.getView().getMainPanel());
        
        medicationModel = new medicationModel();
        medicationView = new medicationView();
        MedicationController = new MedicationController(medicationModel, medicationView);
        
        
        navigationView.getMainFrame().updateFrame(Controller.getView().getMainPanel());

        tableModel table = new tableModel(Model.getMedicationList().getMedications());
        this.table = table;
        

        AddTable();
        AddListeners();
        
        
    }
    public void AddTable() {
        View.getMainPanel().getTablePanel().getTable().setModel(this.table);
    }

    private void AddListeners()
    {
//        This is a listener for the Add medication button
        
        Controller.getView().getMainPanel().getNorthPanel().getB1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Button Pressed");
                
                //pass control to RecipeController by updating mainframe displayed panel
                navigationView.getMainFrame().updateFrame(MedicationController.getMedicationView().getMedicationPanel());

                //back button listener in RecipePanel
                MedicationController.getMedicationView().getMedicationPanel().getMedicationNorthPanel().getB1().addActionListener(new ActionListener() {
                    //pass control back to mainPanel
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        
                        //pass control back to mainPanel
                        navigationView.getMainFrame().updateFrame(Controller.getView().getMainPanel());
                       
                    }
                });
            }
        });
        
        Controller.getView().getMainPanel().getNorthPanel().getB2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                //create a new IngredientPop
                medicationPop = new medicationPop();

                //add listener to create button in popup               
                medicationPop.getCreateBtn().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        
                        
                        if (!medicationPop.getNameText().getText().isEmpty() && !medicationPop.getQuantityText().getText().isEmpty() && !medicationPop.getDescriptionText().getText().isEmpty() && !medicationPop.getSideEffectsText().getText().isEmpty()){
                            //medicationModel.writeMedication(new Medication(medicationPop.getNameText().getText(), medicationPop.getQuantityText().getColumns(), medicationPop.getDescriptionText().getText(), medicationPop.getSideEffectsText().getText()))
                            medicationModel.getMedicationData().addMedication(new Medication(medicationPop.getNameText().getText(), medicationPop.getQuantityText().getColumns(), medicationPop.getDescriptionText().getText(), medicationPop.getSideEffectsText().getText()));
                            
                            medicationModel.refreshMedicationList();
                            medicationPop.dispose();
                            System.out.println("Button Pressed");
                            
                            
                        }
                        
                        else
                        {
                            System.out.println("Error no medication recorded");
                        }
                        

                        
                        
                        
                        //checks to see if any RecipePop fields are empty
//                        if (!popup.getNameText().getText().isEmpty() && !popup.getDescriptionText().getText().isEmpty() && !popup.getTagsText().getText().isEmpty()) {
                            //if non are empty, create a new recipe
//                            model.writeIngredient(new Ingredient(popup.getNameText().getText(), popup.getDescriptionText().getText(), popup.getTagsText().getText()));

                            //dispose popup frame
//                            popup.dispose();

                            //refresh data in view recipe panel
//                            view.getIngredientPanel().updateDataPanel(model.getIngredientData().getIngredientList(), model.getIngredientData().getFirstLine());
//                            scrollMod();

                         //error message if one of the fields are empty
//                        else {
//                            System.out.println("Error: placeholder error message");
                        

                    }
                });
            }

        });
        
        
              
    }

  
}

