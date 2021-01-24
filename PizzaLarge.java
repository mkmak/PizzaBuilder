/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class PizzaLarge extends PizzaBase{
    public PizzaLarge() {
        desc = "Large ";
    }
    
    @Override
    public double cost() {
        return 12.0;
    }
}
