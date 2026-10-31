package PolimorfismoC;

import java.util.Arrays;
import java.util.List;

public class Main {
     public static void main(String[] args) {
        Dancer dancer = new Dancer("Fred", 18);

        Dancer breakdancer = new Breakdancer("Jay", 19); 
        Dancer electricBoogieDancer = new ElectricBoogieDancer("Marcia", 20); 

        List<Dancer> disco = Arrays.asList(dancer, breakdancer, electricBoogieDancer);
        for (Dancer d : disco) {
            d.dance(); 
        }
    }
}
