//Example
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
        catch(NumberFormatException e){
            System.out.println("Invalid value: " + e.getMessage());
        }
        catch(FileNotFoundException e){
            System.out.println("Not found: " + e.getMessage());
        }
        catch(IOException e){
            System.out.println("Error interacting with file: " + e.getMessage());
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
