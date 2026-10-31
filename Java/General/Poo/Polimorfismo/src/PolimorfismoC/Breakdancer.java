package PolimorfismoC;

public class Breakdancer extends Dancer {

    public Breakdancer(String name, int age) {
        super(name, age);
    }
    
    @Override
    public void dance() {
        System.out.println(toString() + " Yo hago breakdance!");
    }
}
