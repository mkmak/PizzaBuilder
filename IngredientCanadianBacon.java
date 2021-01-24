/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class IngredientCanadianBacon extends IngredientDecorator {
    PizzaBase pizza;
    
    public IngredientCanadianBacon(PizzaBase p) {
        pizza = p;
    }
    
    @Override
    public String getDesc() {
        if(pizza.getDesc().contains("with"))
            return pizza.getDesc() + ", canadian bacon";
        else
            return pizza.getDesc() + "with canadian bacon";
    }
    
    @Override
    public double cost() {
        return pizza.cost() + 2.75;
    }
}
