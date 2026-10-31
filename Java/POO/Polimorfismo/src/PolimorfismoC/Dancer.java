package PolimorfismoC;

public class Dancer {
    
    private String name;
    private int age;

    public Dancer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void dance() {
        System.out.println(toString() + " Yo bailo como todos los demás.");
    }

    @Override
    public String toString() {
        return "Yo soy " + name + ". Yo tengo " + age + " años.";
    }
}