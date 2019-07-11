package com.pluralsight.InterfaceExample.myapp;

import com.pluralsight.InterfaceExample.calcengine.Adder;
import com.pluralsight.InterfaceExample.calcengine.DynamicHelper;
import com.pluralsight.InterfaceExample.calcengine.MathProcessing;
import com.pluralsight.InterfaceExample.calcengine.PowerOf;

public class Main {
    public static void main(String[] args){
//        useMathEquation();
//        useCalculatorBase();
//        useCalculateHelper();

        String[] statements = {
                "add 25.0 asd 92.0", //25.0 + 92.0 = 117.0
                "power 5.0 asd 2.0", //5.0 ^ 2.0 = 25.0
        };

        DynamicHelper helper = new DynamicHelper(new MathProcessing[]{
                new Adder(),
                new PowerOf(),
        });

        for(String statement:statements){
            String output = helper.process(statement);
            System.out.println(output);
        }
    }
}
