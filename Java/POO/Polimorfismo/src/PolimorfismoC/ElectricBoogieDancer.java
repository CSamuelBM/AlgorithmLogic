package PolimorfismoC;

public class ElectricBoogieDancer extends Dancer {
    
    public ElectricBoogieDancer(String name, int age) {
        super(name, age);
    }
    
    @Override
    public void dance() {
        System.out.println(toString () + " Yo bailo el boogie eléctrico!");
    }
}
