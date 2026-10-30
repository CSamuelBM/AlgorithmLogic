package paintMov;

import controller.MainController;
import model.MainModel;
import view.MainView;

public class Main {

    public static void main(String[] args) {
        MainModel model = new MainModel();
        MainView view = new MainView();
        MainController controller = new MainController(model, view);
        
        controller.setNombre("Whill");
        controller.setMatricula("2401F0083");
              
        controller.imprimirDatos();
    }
}
