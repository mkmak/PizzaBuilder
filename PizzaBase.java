/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public abstract class PizzaBase {
    protected String desc;
    
    public PizzaBase() {
        desc = "unknown pizza";
    }
    
    public String getDesc() {
        return desc;
    }
    
    public double cost() {
        return 0.0;
    }
}
