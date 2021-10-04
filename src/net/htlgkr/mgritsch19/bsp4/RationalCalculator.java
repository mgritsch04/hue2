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
public class RationalCalculator extends AbstraktCalculator {

    public interface CalculationOperation {

        Number calc(Number x, Number y);
    }

    CalculationOperation add = (x, y) -> {
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

    CalculationOperation subtract = (x, y) -> {
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

    CalculationOperation multiply = (x, y) -> {
        double z1 = x.getA();
        double n1 = x.getB();
        double z2 = y.getA();
        double n2 = y.getB();
        Number ret = null;

        ret.setB(n1 * n2);
        ret.setA(z1 * z2);

        return ret;
    };

    CalculationOperation divide = (x, y) -> {
        double z1 = x.getA();
        double n1 = x.getB();
        double z2 = y.getA();
        double n2 = y.getB();
        Number ret = null;

        ret.setB(n1 / n2);
        ret.setA(z1 / z2);

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
        return subtract(a, b);
    }

    @Override
    public Number divide(Number a, Number b) {
        return divide(a, b);
    }

}
