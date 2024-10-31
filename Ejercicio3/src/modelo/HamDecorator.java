package modelo;

/**
 * Decorador que añade jamón a la pizza.
 */
public class HamDecorator extends PizzaDecorator {
    public HamDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Jamón";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 700.00;
    }
}
