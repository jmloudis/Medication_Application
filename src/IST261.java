import Model.Model;
import View.View;
import Controller.Controller;
import Controller.NavigationController;
import Model.navigationModel;
import View.navigationView;

/**
 *
 * @author DevJordan
 */
public class IST261
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Model m = new Model();
        //View v = new View();
        //Controller c = new Controller(m, v);
        navigationModel m = new navigationModel();
        navigationView v = new navigationView();
        NavigationController c = new NavigationController(m, v);
        // TODO code application logic here
    }
    
    
    
}
