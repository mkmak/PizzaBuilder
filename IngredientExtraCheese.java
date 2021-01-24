/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class IngredientExtraCheese extends IngredientDecorator {
    PizzaBase pizza;
    
    public IngredientExtraCheese(PizzaBase p) {
        pizza = p;
    }
    
    @Override
    public String getDesc() {
        if(pizza.getDesc().contains("with"))
            return pizza.getDesc() + ", exra cheese";
        else
            return pizza.getDesc() + "with exra cheese";
    }
    
    @Override
    public double cost() {
        return pizza.cost() + 1.85;
    }
}
