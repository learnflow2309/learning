package com.pluralsight.myclass;
import com.pluralsight.myclass.*;

public class CallMyClassMethod {
    public static void main(String[] args) {
    }

    public float showSum (float x, float y, int count) {
        float sum = x + y;
        for (int i = 0; i < count; i++)
            System.out.println(sum);
        return sum;
    }
}