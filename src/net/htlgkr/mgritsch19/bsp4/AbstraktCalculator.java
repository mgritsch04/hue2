/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgkr.mgritsch19.bsp4;

import net.htlgkr.mgritsch19.bsp4.Number.CalculationOperation;

/**
 *
 * @author maxim
 */
public abstract class AbstraktCalculator extends Number {

    protected CalculationOperation add;
    protected CalculationOperation subtract;
    protected CalculationOperation multiply;
    protected CalculationOperation divide;

    public AbstraktCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divide) {
        this.add = add;
        this.subtract = subtract;
        this.multiply = multiply;
        this.divide = divide;
    }

    public abstract Number add(Number a, Number b);

    public abstract Number subtract(Number a, Number b);

    public abstract Number multiply(Number a, Number b);

    public abstract Number divide(Number a, Number b);
}
