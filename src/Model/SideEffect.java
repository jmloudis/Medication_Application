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
public class SideEffect
{
//  Attributes / Class Variables / Instance Variables
    
    private String name;
    private String effect;
    
    public SideEffect(String name, String effect)
    {
        
        this.name = name;
        this.effect = effect;
       
    }
    
    public SideEffect()
    {
        this.name = " ";
        this.effect = " ";
                
    }

    @Override
    public String toString()
    {
        return "SideEffect{" + "name=" + name + ", effect=" + effect + '}';
        // sideEffect.toString()
    }
    
    

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEffect()
    {
        return effect;
    }

    public void setEffect(String effect)
    {
        this.effect = effect;
    }
    
    
    
    
    
    
    
}
