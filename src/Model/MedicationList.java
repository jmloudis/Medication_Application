/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jordan
 */
public class MedicationList
{
    
    private ArrayList<Medication> medications;
    private ArrayList listofMedications = new ArrayList();
    private String ListofMedicationsFileName = "listofMedications.ser";
//    
    public MedicationList()
    {
        medications = new ArrayList<>();
        
        Medication m1 = new Medication("Ibuprofen", 2, "Take for headache and fever", "Tiredness");
        Medication m2 = new Medication("Vitamin", 1, "Take for essential vitamins and minerals", "none");
        Medication m3 = new Medication("Blood pressure medication", 1, "take once a day", "tiredness, bleeding");
        Medication m4 = new Medication("Name", 1, "Descrip.", "Side Effect");
        
        medications.add(m1);
        medications.add(m2);
        medications.add(m3);
        medications.add(m4);
        
        this.readMedicationListFile();
        if(listofMedications.isEmpty() || listofMedications == null)
        {
            this.createTestMedicationList();
            this.writeMedicationListFile();
            this.readMedicationListFile();
            
        }
        this.printMedicationList();
        
    }
    
    
    public void addRowToJTable()
    {      
        
    }
    

    public ArrayList<Medication> getMedications()
    {
        return medications;
    }

    public void setMedications(ArrayList<Medication> medications)
    {
        this.medications = medications;
    }
    
    public void addMedication(Medication medications){
        getMedications().add(medications);
    }
    

    private void readMedicationListFile()
    {
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try
        {
            fis = new FileInputStream(ListofMedicationsFileName);
            in = new ObjectInputStream(fis);
            listofMedications = (ArrayList)in.readObject();
            in.close();
            if(!listofMedications.isEmpty())
            {
                System.out.println("There are users in the user list");
                
            }
        }
        
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
        
        catch(ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }

    private void createTestMedicationList()
    {
        for (int i = 0; i < 20; i++)
        {
            listofMedications.add(new Medication("test medication" + i, 1, "Test description", "test effects" + i));
        }
        System.out.println("Test MedicationList created");
        System.out.println("The userlist is:" + listofMedications);
    }

    private void printMedicationList()
    {
        System.out.println("The MedicationList has four medications");
        for (int i = 0; i < listofMedications.size(); i++)
        {
            Medication currentMedication = (Medication) listofMedications.get(i);
            System.out.println(currentMedication.getName());
            
        }
        
        
    }

    private void writeMedicationListFile()
    {
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try{
            fos = new FileOutputStream(ListofMedicationsFileName);
            out = new ObjectOutputStream(fos);
            out.writeObject(listofMedications);
            out.close();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        
        
    }

    
    
    
    
    
    
    
    
}
