/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandcalculator;

import java.util.Scanner;

/**
 *
 * @author w_ara
 */
public class Operations {
    
    static double result=0.0;
    public double add(double val_1, double val_2) 
    {
       
        result = val_1 + val_2;

        return (double)result;
    }

    public double multiply(double val_1, double val_2) 
    {
        result = val_1 * val_2;
        return result;
    }

    public double division(double val_1, double val_2) 
    {
        result = val_1 / val_2;
        return result;
    }
    public double substract(double val_1, double val_2) 
    {
        result = val_1 - val_2;
        return result;
    }

}
