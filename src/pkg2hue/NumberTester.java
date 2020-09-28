/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2hue;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ben Obermüller
 */
public class NumberTester {
    private String fileName;
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromTester;
    
    
    public NumberTester(String fileName) {
        this.fileName = fileName;
    }
    
    public void setOddEvenTester(NumberTest oddTester){
        this.oddTester = oddTester;
    }
    public void setPrimeTester(NumberTest primeTester){
        this.primeTester = primeTester;
    }
    
    public void setPalindromeTester(NumberTest palindromTester){
        this.palindromTester = palindromTester;
    }
    
    public void testFile(){
        try {
            BufferedReader br = new BufferedReader(new FileReader(this.fileName));
            String line = br.readLine();
            while (line!=null) {
                
                String[] arr = line.split(" ");
                if(Integer.parseInt(arr[0]) == 1){
                    if(oddTester.testNumber(Integer.parseInt(arr[1]))==true){
                        System.out.println("EVEN");
                    }else{
                        System.out.println("ODD");
                    }
                    
                }else if(Integer.parseInt(arr[0]) == 2){
                    if(primeTester.testNumber(Integer.parseInt(arr[1]))==true){
                        System.out.println("PRIME");
                    }else{
                        System.out.println("NO PRIME");
                    }
                    
                }else if(Integer.parseInt(arr[0]) == 3){
                    if(palindromTester.testNumber(Integer.parseInt(arr[1]))==true){
                        System.out.println("PALINDROME");
                    }else{
                        System.out.println("NO PALINDROME");
                    }
                }else{
                    System.out.println("Fehler!");
                }
                
                line = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NumberTester.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NumberTester.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
