package com.pluralsight.calcengine.withmoredatatypecapabilities;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Using additional data type capabilities");
        System.out.println();

        String[] statements = {
                "divide 100.0 50.0", //What we want to print out: 100.0 / 50.0 = 2.0
                "add 25.0 92.0", //What we want to print out: 25.0 + 92.0 = 117.0
                "subtract 225.0 17.0", //What we want to print out: 225.0 - 17.0 = 108.0
                "multiply 11.0 3.0", //What we want to print out: 11.0 * 3.0 = 33.0
                "add 13.0 13.0",
        };

        CalculateHelper helper = new CalculateHelper();
        for(String statement:statements){
            helper.process(statement);
            System.out.println(helper);
        }
    }
}