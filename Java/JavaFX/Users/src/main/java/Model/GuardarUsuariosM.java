package Model;

import java.util.ArrayList;
import java.util.List;

public class GuardarUsuariosM {

    private List<UserM> listUser = new ArrayList<>();

    public GuardarUsuariosM(){
        crear();
    }

    private void crear(){
        listUser.add(new UserM("root", "123"));
        listUser.add(new UserM("master", "123"));
    }

    public boolean verificarUser(String name, String pass){
        boolean paso = false;
        for(UserM u : listUser){
            if(u.getName().equals(name) && u.getPass().equals(pass)){
                paso = true;
                break;
            }
        }
        return paso;
    }

}
