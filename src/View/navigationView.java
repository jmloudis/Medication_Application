/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author jordan
 */
public class navigationView
{
    private mainFrame mainFrame;
    
    public navigationView(){
        mainFrame = new mainFrame();
    }

    public mainFrame getMainFrame()
    {
        return mainFrame;
    }

    public void setMainFrame(mainFrame mainFrame)
    {
        this.mainFrame = mainFrame;
    }
    
    
}
