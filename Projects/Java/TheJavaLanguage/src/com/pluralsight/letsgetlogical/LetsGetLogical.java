package com.pluralsight.letsgetlogical;

public class LetsGetLogical {
    public static void main(String[] args) {
        int students = 150;
        int rooms = 0;

//        if (rooms > 0 & students/rooms > 30)
//            System.out.println("Crowded!!");

        if (rooms > 0 && students / rooms > 30)
            System.out.println("Crowded!!");

        float[] theVals = { 10.0f, 20.0f, 15.0f};
        float sum = 0.0f;
        for(float currentVal : theVals)
            sum += currentVal;

        System.out.println(sum);
        System.out.println("");
        System.out.println("** end program **");
    }
}
