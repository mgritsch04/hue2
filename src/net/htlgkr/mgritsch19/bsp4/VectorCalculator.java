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
public class VectorCalculator extends AbstraktCalculator {

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
        return null;
    };
    CalculationOperation multiply = (x, y) -> {
        return null;
    };
    CalculationOperation divide = (x, y) -> {
        return null;
    };

    @Override
    public Number add(Number a, Number b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Number subtract(Number a, Number b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Number multiply(Number a, Number b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Number divide(Number a, Number b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
