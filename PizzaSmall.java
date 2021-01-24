/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class PizzaSmall extends PizzaBase {
    public PizzaSmall() {
        desc = "Small ";
    }
    
    @Override
    public double cost() {
        return 8.0;
    }
}
