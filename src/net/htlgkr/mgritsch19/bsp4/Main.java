/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgkr.mgritsch19.bsp4;

import java.util.Scanner;

/**
 *
 * @author maxim
 */
public class Main {

    public static void main(String[] args) {
        Number.CalculationOperation addRational = (x, y) -> {
            double z1 = x.getA();
            double n1 = x.getB();
            double z2 = y.getA();
            double n2 = y.getB();
            Number ret = null;

            if (n1 == n2) {
                ret.setB(n1);
                ret.setA(z1 + z2);
            } else {
                ret.setB(n1 * n2);
                ret.setA((z1 * n2) + (z2 * n1));
            }

            return ret;
        };

        Number.CalculationOperation subtractRational = (x, y) -> {
            double z1 = x.getA();
            double n1 = x.getB();
            double z2 = y.getA();
            double n2 = y.getB();
            Number ret = null;

            if (n1 == n2) {
                ret.setB(n1);
                ret.setA(z1 + z2);
            } else {
                ret.setB(n1 * n2);
                ret.setA((z1 * n2) - (z2 * n1));
            }

            return ret;
        };

        Number.CalculationOperation multiplyRational = (x, y) -> {
            double z1 = x.getA();
            double n1 = x.getB();
            double z2 = y.getA();
            double n2 = y.getB();
            Number ret = null;

            ret.setB(n1 * n2);
            ret.setA(z1 * z2);

            return ret;
        };

        Number.CalculationOperation divideRational = (x, y) -> {
            double z1 = x.getA();
            double n1 = x.getB();
            double z2 = y.getA();
            double n2 = y.getB();
            Number ret = null;

            ret.setB(n1 / n2);
            ret.setA(z1 / z2);

            return ret;
        };

        RationalCalculator rc = new RationalCalculator(addRational, subtractRational, multiplyRational, divideRational);

        Number.CalculationOperation addVector = (x, y) -> {
            double z1 = x.getA();
            double n1 = x.getB();
            double z2 = y.getA();
            double n2 = y.getB();
            Number ret = null;

            ret.setA(z1 + z2);
            ret.setB(n1 + n2);

            return ret;
        };

        Number.CalculationOperation subtractVector = (x, y) -> {
            double z1 = x.getA();
            double n1 = x.getB();
            double z2 = y.getA();
            double n2 = y.getB();
            Number ret = null;

            ret.setA(z1 - z2);
            ret.setB(n1 - n2);

            return ret;
        };
        Number.CalculationOperation multiplyVector = (x, y) -> {
            double z1 = x.getA();
            double n1 = x.getB();
            double z2 = y.getA();
            double n2 = y.getB();
            Number ret = null;

            ret.setA(z1 * n2);
            ret.setB(n1 * z2);

            return ret;
        };
        Number.CalculationOperation divideVector = (x, y) -> {
            double z1 = x.getA();
            double n1 = x.getB();
            double z2 = y.getA();
            double n2 = y.getB();
            Number ret = null;

            ret.setA(z1 / n2);
            ret.setB(n1 / z2);

            return ret;
        };

        VectorCalculator vc = new VectorCalculator(addVector, subtractVector, multiplyVector, divideVector);

        Number.CalculationOperation addComplex = (x, y) -> {
            double re1 = x.getA();
            double im1 = x.getB();
            double re2 = y.getA();
            double im2 = y.getB();
            Number ret = null;

            ret.setA(re1 + re2);
            ret.setB(im1 + im2);

            return ret;
        };

        Number.CalculationOperation subtractComplex = (x, y) -> {
            double re1 = x.getA();
            double im1 = x.getB();
            double re2 = y.getA();
            double im2 = y.getB();
            Number ret = null;

            ret.setA(re1 - re2);
            ret.setB(im1 - im2);

            return ret;
        };

        Number.CalculationOperation multiplyComplex = (x, y) -> {
            double re1 = x.getA();
            double im1 = x.getB();
            double re2 = y.getA();
            double im2 = y.getB();
            Number ret = null;

            ret.setA(re1 * re2 - im1 * im1);
            ret.setB(im1 * re1 + re1 * im2);

            return ret;
        };

        Number.CalculationOperation divideComplex = (x, y) -> {
            double re1 = x.getA();
            double im1 = x.getB();
            double re2 = y.getA();
            double im2 = y.getB();
            Number ret = null;

            ret.setA((re1 * re2 + im1 * im2) / (re1 * re1 + im1 * im1));
            ret.setB((im1 * re2 - re1 * im2) / (re2 * re2 + im2 * im2));

            return ret;
        };

        ComplexCalculator cc = new ComplexCalculator(addVector, subtractVector, multiplyVector, divideVector);

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Choose calculator");
            System.out.println("1 - Relational Calculator");
            System.out.println("2 - Vector Caluclator");
            System.out.println("3 - Complex Calculator");
            System.out.println("4 - Exit program");

            int eing = Integer.parseInt(sc.nextLine());
            Number erg = null;

            switch (eing) {
                case 1:
                case 2:
                case 3:
                    boolean b = true;
                    while (b == true) {

                        System.out.println("Enter number x a>");
                        double xa = Double.parseDouble(sc.nextLine());
                        System.out.println("Enter number x b>");
                        double xb = Double.parseDouble(sc.nextLine());
                        System.out.println("Enter number y a>");
                        double ya = Double.parseDouble(sc.nextLine());
                        System.out.println("Enter number y b>");
                        double yb = Double.parseDouble(sc.nextLine());

                        System.out.println("Choose operation: ");
                        System.out.println("1 - add");
                        System.out.println("2 - subtract");
                        System.out.println("3 - multiply");
                        System.out.println("4 - divide");
                        System.out.println("5 - enter numbers again");
                        Number n1 = new Number();
                        n1.setA(xa);
                        n1.setB(ya);
                        Number n2 = new Number();
                        n2.setA(xb);
                        n2.setB(yb);

                        int operation = Integer.parseInt(sc.nextLine());
                        switch (operation) {
                            case 1:
                                switch (eing) {
                                    case 1:
                                        erg = rc.add(n1, n2);
                                        break;
                                    case 2:
                                        erg = vc.add(n1, n2);
                                        break;
                                    case 3:
                                        erg = cc.add(n1, n2);
                                        break;
                                }
                                break;
                            case 2:
                                switch (eing) {
                                    case 1:
                                        erg = rc.subtract(n1, n2);
                                        break;
                                    case 2:
                                        erg = vc.subtract(n1, n2);
                                        break;
                                    case 3:
                                        erg = cc.subtract(n1, n2);
                                        break;
                                }
                                break;
                            case 3:
                                switch (eing) {
                                    case 1:
                                        erg = rc.multiply(n1, n2);
                                        break;
                                    case 2:
                                        erg = vc.multiply(n1, n2);
                                        break;
                                    case 3:
                                        erg = cc.multiply(n1, n2);
                                        break;
                                }
                                break;

                            case 4:
                                switch (eing) {
                                    case 1:
                                        erg = rc.divide(n1, n2);
                                        break;
                                    case 2:
                                        erg = vc.divide(n1, n2);
                                        break;
                                    case 3:
                                        erg = cc.divide(n1, n2);
                                        break;
                                }
                                break;
                        }
                    }
                    System.out.println("Solution");
                    System.out.println("a = " + erg.getA());
                    System.out.println("b = " + erg.getB());
                    break;
                case 4:
                    System.exit(-1);
                    break;
                default:
                    System.out.println("Choose a number between 1-4");
                    break;
            }
        }
    }
}
