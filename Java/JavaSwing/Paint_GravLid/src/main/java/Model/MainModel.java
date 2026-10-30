package Model;

public class MainModel {
    private GuardarFigura figura;
    private ModoFigura modo;
    
    public MainModel(){
        figura = new GuardarFigura();
        modo = ModoFigura.LAPIZ;
    }
    
    public GuardarFigura getGuardarFigura(){
        return figura;
    }
    public ModoFigura getModoFigura(){
        return modo;
    }
    
}
