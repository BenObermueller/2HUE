/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2hue;

/**
 *
 * @author Ben Obermüller
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        HalloJavamitForEach e = new HalloJavamitForEach();
//        e.printList();
//        e.printList2();
//        e.printList3();
//        e.printList4();
        NumberTester nt = new NumberTester("NumbersForTest.txt");
        
        
        nt.testFile();
    }
    
}
