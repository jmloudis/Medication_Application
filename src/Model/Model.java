/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author jordan
 */
public class Model
{
    //private String v1;
    
    private ArrayList<Medication> medications;
    
    private ArrayList<String> names;
    
    private MedicationList medicationList;
    
    private tableModel table;
    
    
    public Model()
    {
        medicationList = new MedicationList();
        
        //v1 = new String(;
        
        //      "Still working on Pop Panel for JButtons"
        
        
        
//        Medication mc1, mc2, mc3;
//        medications = new ArrayList<>();
//        
//        mc1 = new Medication("Use for headaches and fever", 2, "Advil", "None");
//        mc2 = new Medication("Use for essential daily vitamins and minerals", 3, "Multi-Vitamin", "Can cause bleeding if too many are taken");
//        mc3 = new Medication("Use for motion sickness", 2, "Dramamine", "Tired in the morning");
//        
//        medications.add(mc1);
//        medications.add(mc2);
//        medications.add(mc3);
//        medications.add(new Medication());
        
        
        
    }
    
    
    

    public Medication getMedication(int n)
    {
        return medications.get(n);
    }
    

    public ArrayList<Medication> getMedications()
    {
        return medications;
    }

    public void setMedications(ArrayList<Medication> medications)
    {
        this.medications = medications;
    }
    
    public ArrayList<String> names()
    {
        ArrayList<String> n = new ArrayList<String>();
        
        for (int i = 0; i < medications.size(); i++)
            
        {
            n.add(medications.get(i).getName());
        }
        
        return n;
    }

    public MedicationList getMedicationList()
    {
        return medicationList;
    }

    public void setMedicationList(MedicationList medicationList)
    {
        this.medicationList = medicationList;
    }

    public tableModel getTable()
    {
        return table;
    }

    public void setTable(tableModel table)
    {
        this.table = table;
    }
    
    
    
    
    
    
    
    
    
}
