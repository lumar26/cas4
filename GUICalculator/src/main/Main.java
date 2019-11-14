/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import form.CalculatorPanelForm;
import javax.swing.JFrame;

/**
 *
 * @author student1
 */
public class Main {
    public static void main(String[] args) {
//        JFrame form = new JFrame("Calculator");
//        form.setSize(800, 600);
//        form.setVisible(true);
        JFrame calculatorForm = new CalculatorPanelForm();
        calculatorForm.setVisible(true);
    }
}
