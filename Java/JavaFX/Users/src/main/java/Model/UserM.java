package Model;

public class UserM {

    private String name;
    private String pass;

    public UserM(String name, String pass){
        setName(name);
        setPass(pass);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        if(!name.isEmpty())
            this.name = name;
    }

    public String getPass(){
        return pass;
    }
    public void setPass(String pass){
        if(!pass.isEmpty())
             this.pass = pass;
    }

}
