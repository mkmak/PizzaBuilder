/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class FactoryPizza {
    public static PizzaBase getPizza(int input) {
        if(input == 1) return new PizzaSmall();
        else if(input == 2) return new PizzaMedium();
        else if(input == 3) return new PizzaLarge();
        else if(input == 4) return new PizzaFamily();
        else return null;
    }
}
