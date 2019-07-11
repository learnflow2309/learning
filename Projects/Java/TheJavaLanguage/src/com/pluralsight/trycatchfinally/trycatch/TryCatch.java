package com.pluralsight.trycatchfinally.trycatch;

public class TryCatch {
    public static void main(String[] args) {
        int i = 12;
        int j = 2;
        try{
            int result = i / (j-2); //12 / 0
            System.out.println(result); //Error
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage()); //Error: / by zero
            e.printStackTrace(); //Vraća točno što se je krivo dogodilo
        }
    }
}
