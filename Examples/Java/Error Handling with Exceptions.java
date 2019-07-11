//Example 1
int i = 12;
int j = 5;
int result = i / (j-2); //12 / 3
System.out.println(result); //4

//Example 2
int i = 12;
int j = 2;
try{
	int result = i / (j-2); //12 / 0
	System.out.println(result); //4
}
catch(Exception e){
	System.out.println("Error: " + e.getMessage()); //Error: / by zero
	e.printStackTrace(); //Vraća točno što se je krivo dogodilo
}

//Example 3
package com.pluralsight.trycatchfinally.trycatch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryCatch2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        int total = 0;

        try {
            reader = new BufferedReader(new FileReader("D:\\Learn\\Examples\\Java\\Numbers.txt"));
            String line = null;
            while ((line = reader.readLine()) != null) {
                total += Integer.valueOf(line);
            }

            System.out.println("Total: " + total);
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            try{
                if(reader != null){
                    reader.close();
                }
            }
            catch(Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
