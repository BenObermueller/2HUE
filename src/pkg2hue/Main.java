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

        nt.setOddEvenTester((n) -> {
            if (n % 2 == 0) {
                return true;
            } else {
                return false;
            }
        });

        nt.setPrimeTester((n)-> {
            for (int i = 2; i < n; i++) {
                int a = n % i;
                if (a == 0) {
                    return false;
                }
            }
            return true;
        });

        nt.setPalindromeTester((n) -> {
            return false;
        });

        nt.testFile();
    }

}
