/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class IngredientPepperoni extends IngredientDecorator {
    PizzaBase pizza;
    
    public IngredientPepperoni(PizzaBase p) {
        pizza = p;
    }
    
    @Override
    public String getDesc() {
        if(pizza.getDesc().contains("with"))
            return pizza.getDesc() + ", pepperoni";
        else
            return pizza.getDesc() + "with pepperoni";
    }
    
    @Override
    public double cost() {
        return pizza.cost() + 2.0;
    }
}
