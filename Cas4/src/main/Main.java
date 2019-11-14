package main;

import calculator.MyCalculator;
import impl.MyCalculatorImpl;

public class Main {

    public static void main(String[] args) {
        int a = 3, b = 5, c = 0;
        MyCalculator calc1 = new MyCalculatorImpl();
        c = calc1.add(a, b);
        System.out.println(a + " + " + b + " = " + c);
    }
    
}
