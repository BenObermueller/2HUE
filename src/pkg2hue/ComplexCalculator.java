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
public class ComplexCalculator extends AbstractCalculator{

    public ComplexCalculator(CalculateOperation add, CalculateOperation sub, CalculateOperation mult, CalculateOperation div) {
        super(add, sub, mult, div);
    }

    @Override
    public Number add(Number a, Number b) {
        return this.add.calc(a, b);
    }

    @Override
    public Number sub(Number a, Number b) {
        return this.sub.calc(a, b);
    }

    @Override
    public Number mult(Number a, Number b) {
        return this.mult.calc(a, b);
    }

    @Override
    public Number div(Number a, Number b) {
        return this.div.calc(a, b);
    }
    
}
