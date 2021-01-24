/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class PizzaMedium extends PizzaBase {
    public PizzaMedium() {
        desc = "Medium ";
    }
    
    @Override
    public double cost() {
        return 10.0;
    }
}
