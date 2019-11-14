
package main;

import calculator_adapter.MyCalculatorAdapter;
import data_type.MyInteger;
import impl.MyCalculatorAdapterImpl;
import impl.MyCalculatorImpl;

public class Main {

    public static void main(String[] args) {
        int a = 3, b = 5;
        MyInteger c = new MyInteger(0);
        MyCalculatorAdapter calc1 = new MyCalculatorAdapterImpl(new MyCalculatorImpl());
        
        calc1.add(a, b, c);
        System.out.println(a + " + " + b + " = " + c.toString());
    }
    
}
