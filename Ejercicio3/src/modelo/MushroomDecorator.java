package modelo;

/**
 * Decorador que añade champiñones a la pizza.
 */
public class MushroomDecorator extends PizzaDecorator {
    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Champiñones";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 600.00;
    }
}
