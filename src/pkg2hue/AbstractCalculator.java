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
public abstract class AbstractCalculator {
    protected CalculateOperation add;
    protected CalculateOperation sub;
    protected CalculateOperation mult;
    protected CalculateOperation div;

    public AbstractCalculator(CalculateOperation add, CalculateOperation sub, CalculateOperation mult, CalculateOperation div) {
        this.add = add;
        this.sub = sub;
        this.mult = mult;
        this.div = div;
    }
    
    public abstract Number add(Number a, Number b);
    public abstract Number sub(Number a, Number b);
    public abstract Number mult(Number a, Number b);
    public abstract Number div(Number a, Number b);
}
