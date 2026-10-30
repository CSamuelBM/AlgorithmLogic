package main.paintgravlid;

import View.MainView;
import javax.swing.SwingUtilities;

public class PaintGravLid {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {   
            MainView view = new MainView();
            
            view.setVisible(true);
        });
    }
}
