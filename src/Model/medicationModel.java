/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author jordan
 */
public class medicationModel
{
    private MedicationList medicationData;
    
    public medicationModel()
    {
        medicationData = new MedicationList();

    }

    public MedicationList getMedicationData()
    {
        return medicationData;
    }

    public void setMedicationData(MedicationList medicationData)
    {
        this.medicationData = medicationData;
    }
    
    public void writeMedication(Medication input)
    {
        medicationData.addMedication(input); 
        
    }
    
    public void refreshMedicationList(){
        medicationData = new MedicationList();
    }
    
    
    
    
}
