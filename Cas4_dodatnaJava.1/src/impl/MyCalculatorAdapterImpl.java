
package impl;

import calculator.MyCalculator;
import calculator_adapter.MyCalculatorAdapter;
import data_type.MyInteger;

public class MyCalculatorAdapterImpl implements MyCalculatorAdapter{
    MyCalculator myCalculator;

    public MyCalculatorAdapterImpl(MyCalculator myCalculator) {
        this.myCalculator = myCalculator;
    }
    
    
    @Override
    public void add(int a, int b, MyInteger c) {
      // c = new MyInteger(a+b);
      // c.setValue(a+b);
      MyCalculator myCalculator = new MyCalculatorImpl();
      c.setValue(myCalculator.add(a, b));
    }
    
}
