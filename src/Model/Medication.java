/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author jordan
 */
public class Medication extends SideEffect implements Serializable
{
    private String description;
    private int quantity;
    
    public Medication(String name, int quantity, String Description, String effect){
        
        super(name, effect);
        this.description = Description;
        this.quantity = quantity;
        
    }
    
    public Medication ()
    {
        super();
        this.description = " Test ";
        this.quantity = 1;
    }

    @Override
    public String toString()
    {
        return super.toString() + " " + "Medication{" + "description=" + description + ", quantity=" + quantity + '}';
    }
    
    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    
    
    
    
}
