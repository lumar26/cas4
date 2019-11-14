/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_type;

/**
 *
 * @author student1
 */
public  class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public void setValue(int value){
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
    
    
}
