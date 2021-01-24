/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class IngredientBeer extends IngredientDecorator {
    PizzaBase pizza;
    
    public IngredientBeer(PizzaBase p) {
        pizza = p;
    }
    
    @Override
    public String getDesc() {
        if(pizza.getDesc().contains("with"))
            return pizza.getDesc() + ", beer";
        else
            return pizza.getDesc() + "with beer";
    }
    
    @Override
    public double cost() {
        return pizza.cost() + 3.25;
    }
}
