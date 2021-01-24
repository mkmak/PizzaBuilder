/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class FactoryIngredient {
    public static IngredientDecorator getIngredient(String input, PizzaBase pizza) {
        if(input.equals("P") || input.equals("p"))
            return new IngredientPepperoni(pizza);
        else if(input.equals("S") || input.equals("s"))
            return new IngredientSausage(pizza);
        else if(input.equals("H") || input.equals("h"))
            return new IngredientHamburger(pizza);
        else if(input.equals("C") || input.equals("c"))
            return new IngredientCanadianBacon(pizza);
        else if(input.equals("E") || input.equals("e"))
            return new IngredientExtraCheese(pizza);
        else if(input.equals("O") || input.equals("o"))
            return new IngredientOnions(pizza);
        else if(input.equals("G") || input.equals("g"))
            return new IngredientGreenPepper(pizza);
        else if(input.equals("B") || input.equals("b"))
            return new IngredientBlackOlives(pizza);
        else if(input.equals("N") || input.equals("n"))
            return new IngredientGreenOlives(pizza);
        else if(input.equals("M") || input.equals("m"))
            return new IngredientMushrooms(pizza);
        else if(input.equals("A") || input.equals("a"))
            return new IngredientAnchovies(pizza);
        else if(input.equals("R") || input.equals("r"))
            return new IngredientBeer(pizza);
        else return null;
    }
}
