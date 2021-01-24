/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class IngredientMushrooms extends IngredientDecorator {
    PizzaBase pizza;
    
    public IngredientMushrooms(PizzaBase p) {
        pizza = p;
    }
    
    @Override
    public String getDesc() {
        if(pizza.getDesc().contains("with"))
            return pizza.getDesc() + ", mushrooms";
        else
            return pizza.getDesc() + "with mushrooms";
    }
    
    @Override
    public double cost() {
        return pizza.cost() + 1.75;
    }
}
