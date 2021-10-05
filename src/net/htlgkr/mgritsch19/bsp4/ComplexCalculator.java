/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgkr.mgritsch19.bsp4;

/**
 *
 * @author maxim
 */
public class ComplexCalculator extends AbstraktCalculator {

    public ComplexCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divide) {
        super(add, subtract, multiply, divide);
    }

    CalculationOperation add = (x, y) -> {
        double re1 = x.getA();
        double im1 = x.getB();
        double re2 = y.getA();
        double im2 = y.getB();
        Number ret = null;

        ret.setA(re1 + re2);
        ret.setB(im1 + im2);

        return ret;
    };

    CalculationOperation subtract = (x, y) -> {
        double re1 = x.getA();
        double im1 = x.getB();
        double re2 = y.getA();
        double im2 = y.getB();
        Number ret = null;

        ret.setA(re1 - re2);
        ret.setB(im1 - im2);

        return ret;
    };

    CalculationOperation multiply = (x, y) -> {
        double re1 = x.getA();
        double im1 = x.getB();
        double re2 = y.getA();
        double im2 = y.getB();
        Number ret = null;

        ret.setA(re1 * re2 - im1 * im1);
        ret.setB(im1 * re1 + re1 * im2);

        return ret;
    };

    CalculationOperation divide = (x, y) -> {
        double re1 = x.getA();
        double im1 = x.getB();
        double re2 = y.getA();
        double im2 = y.getB();
        Number ret = null;

        ret.setA((re1 * re2 + im1 * im2) / (re1 * re1 + im1 * im1));
        ret.setB((im1 * re2 - re1 * im2) / (re2 * re2 + im2 * im2));

        return ret;
    };

    @Override

    public Number add(Number a, Number b) {
        return add(a, b);
    }

    @Override
    public Number subtract(Number a, Number b) {
        return subtract(a, b);
    }

    @Override
    public Number multiply(Number a, Number b) {
        return multiply(a, b);
    }

    @Override
    public Number divide(Number a, Number b) {
        return divide(a, b);
    }

}
