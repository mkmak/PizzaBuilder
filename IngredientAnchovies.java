/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class IngredientAnchovies extends IngredientDecorator {
    PizzaBase pizza;
    
    public IngredientAnchovies(PizzaBase p) {
        pizza = p;
    }
    
    @Override
    public String getDesc() {
        if(pizza.getDesc().contains("with"))
            return pizza.getDesc() + ", anchovies";
        else
            return pizza.getDesc() + "with anchovies";
    }
    
    public double cost() {
        return pizza.cost();
    }
}
