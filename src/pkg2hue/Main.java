/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2hue;

import java.util.Scanner;

/**
 *
 * @author Ben Obermüller
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main main = new Main();
        main.AbstractCalculatorM();

    }

    private int auswUnterM() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Operation");
        System.out.println("1 - add");
        System.out.println("2 - sub");
        System.out.println("3 - mult");
        System.out.println("4 - div");
        System.out.println("5 - enter Numbers again");
        return Integer.parseInt(sc.nextLine());
    }

    private void AbstractCalculatorM() {
        RationalCalculator rc = new RationalCalculator(
                (Number x, Number y) -> {
                    Number n = new Number(x.getA() + y.getA(), 1);
                    double newNenner = x.getB() * y.getB();
                    double newZforX = x.getA() * y.getB();
                    double newZforY = y.getA() * x.getB();

                    return new Number(newZforX + newZforY, newNenner);
                }, (Number x, Number y) -> {
                    Number n = new Number(x.getA() + y.getA(), 1);
                    double newNenner = x.getB() * y.getB();
                    double newZforX = x.getA() * y.getB();
                    double newZforY = y.getA() * x.getB();

                    return new Number(newZforX - newZforY, newNenner);
                }, (Number x, Number y) -> {
                    return new Number(x.getA() * y.getA(), x.getB() * y.getB());
                }, (Number x, Number y) -> {
                    return new Number(x.getA() * y.getB(), x.getB() * y.getA());
                });

        VectorCalculator vc = new VectorCalculator(
                (Number x, Number y) -> {
                    return new Number(x.getA() + y.getA(), x.getB() + y.getB());
                }, (Number x, Number y) -> {
                    return new Number(x.getA() - y.getA(), x.getB() - y.getB());
                }, (Number x, Number y) -> {
                    //Kruez
                    return new Number((x.getA() * y.getB()) - (x.getB() * y.getA()), 0);
                }, (Number x, Number y) -> {
                    //Skalar
                    return new Number((x.getA() * y.getA()) + (x.getB() * y.getB()), 0);
                });

        Scanner sc = new Scanner(System.in);
        int auswM;
        do {
            System.out.println("Choose Calculator");
            System.out.println("1 - RationalCalculator");
            System.out.println("2 - VectorCalculator");
            System.out.println("3 - ComplexCalculator");
            System.out.println("4 - Exit");
            auswM = Integer.parseInt(sc.nextLine());
            if(auswM == 4){
                break;
            }
            Main m = new Main();

            //RationalC
            System.out.println("A/X");
            int ax = Integer.parseInt(sc.nextLine());
            System.out.println("A/Y");
            int ay = Integer.parseInt(sc.nextLine());
            Number x = new Number(ax, ay);

            System.out.println("B/X");
            int bx = Integer.parseInt(sc.nextLine());
            System.out.println("B/Y");
            int by = Integer.parseInt(sc.nextLine());
            Number y = new Number(bx, by);

            switch (auswM) {
                case 1:
                    switch (m.auswUnterM()) {
                        case 1:
                            //Add
                            System.out.println(rc.add(x, y).getA() + "/" + rc.add(x, y).getB());
                            break;
                        case 2:
                            //Sub
                            System.out.println(rc.sub(x, y).getA() + "/" + rc.sub(x, y).getB());
                            break;
                        case 3:
                            //Mult
                            System.out.println(rc.mult(x, y).getA() + "/" + rc.mult(x, y).getB());
                            break;
                        case 4:
                            //Div
                            System.out.println(rc.div(x, y).getA() + "/" + rc.div(x, y).getB());
                            break;
                        case 5:
                            break;
                    }
                    break;
                case 2:
                    //VectorCalculator
                    switch (m.auswUnterM()) {
                        case 1:
                            System.out.println(vc.add(x, y).getA() + "/" + vc.add(x, y).getB());
                            break;
                        case 2:
                            System.out.println(vc.sub(x, y).getA() + "/" + vc.sub(x, y).getB());
                            break;
                        case 3:
                            System.out.println(vc.mult(x, y).getA() + "/" + vc.mult(x, y).getB());
                            break;
                        case 4:
                            System.out.println(vc.div(x, y).getA() + "/" + vc.div(x, y).getB());
                            break;
                        case 5:
                            break;
                    }
                    break;
                case 3:
                    //ComplexCalculator
                    switch (m.auswUnterM()) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                    }
                    break;
            }
        } while (auswM != 4);
    }

    private void numberTesterM() {
        NumberTester nt = new NumberTester("NumbersForTest.txt");

        nt.setOddEvenTester((n) -> {
            if (n % 2 == 0) {
                return true;
            } else {
                return false;
            }
        });

        nt.setPrimeTester((n) -> {
            for (int i = 2; i < n; i++) {
                int a = n % i;
                if (a == 0) {
                    return false;
                }
            }
            return true;
        });

        nt.setPalindromeTester((n) -> {
            int r, sum = 0, temp;

            temp = n;
            while (n > 0) {
                r = n % 10;
                sum = (sum * 10) + r;
                n = n / 10;
            }
            if (temp == sum) {
                return true;
            } else {
                return false;
            }
        });

        nt.testFile();
    }

    private void HalloJavaMitForEachM() {
        HalloJavamitForEach e = new HalloJavamitForEach();
        e.printList();
        e.printList2();
        e.printList3();
        e.printList4();
    }

}
