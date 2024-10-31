package modelo;

/**
 * Decorador que añade queso extra a la pizza.
 */
public class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Queso extra";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 550.00;
    }
}
