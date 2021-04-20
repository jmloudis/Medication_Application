/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jordan
 */
public class tableModel extends AbstractTableModel
{
    private final String[] columnNames = {"Name", "Quantity", "Description", "side effects"};
    private ArrayList<Medication> medications;

    public tableModel(ArrayList<Medication> newMedications)
    {
        medications = newMedications;
       
    }

//    public tableModel()
//    {
//        
//        
//    }
    
    public String toString(){
    return this.medications.toString();
    }

    @Override
    public int getRowCount()
    {
        return medications.size();
    }

    @Override
    public int getColumnCount()
    {
        return columnNames.length;

    }
    
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Object getValueAt(int row, int col)
    {
        switch(col){
            case 0: return (Object) medications.get(row).getName();
            case 1: return (Object) medications.get(row).getQuantity();
            case 2: return (Object) medications.get(row).getDescription();
            case 3: return (Object) medications.get(row).getEffect();
            default: return null;
        }
        
    }

    public ArrayList<Medication> getMedications()
    {
        return medications;
    }

    public void setMedications(ArrayList<Medication> medications)
    {
        this.medications = medications;
    }
    
   
    
    
    
    

    
    

    
    
    
}
