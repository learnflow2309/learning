package com.pluralsight.typeconversion;

public class TypeConversion {
    public static void main(String[] args) {
        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        short result1 = byteVal; //Success
        System.out.println("Success 1");

        //short result2 = longVal; //Fail
        short result2 = (short)longVal; //Success
        System.out.println("Success 2");

        short result3 = (short)byteVal; //Success
        System.out.println("Success 3");

        //short result4 = byteVal - longVal; //Fail
        short result4 = (short)(byteVal - longVal); //Success
        System.out.println("Success 4");

        //long result5 = longVal - floatVal; //Fail
        float result5 = longVal - floatVal; //Success
        System.out.println("Success 5");

        //float result6 = longVal - doubleVal; //Fail
        double result6 = longVal - doubleVal; //Success
        System.out.println("Success 6");

        long result7 = shortVal - longVal; //Success
        System.out.println("Success 7");

        //long result8 = shortVal - longVal + floatVal; //Fail
        //long result8 = shortVal - longVal + floatVal + doubleVal; //Fail
        long result8 = (long) (shortVal - longVal + floatVal + doubleVal); //Success
        System.out.println("Success 8");
    }
}
