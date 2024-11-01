package modelo;

/**
 * Decorador que añade champiñones a la pizza.
 */
public class MushroomDecorator extends PizzaDecorator {
    /**
     * Crea un decorador de champiñones para una pizza
     * @param pizza la pizza a decorar con champiñones
     */
    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }
    /**
     * Obtiene la descripción de la pizza con champiñones
     */
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Champiñones";
    }
    /**
     * Calcula el costo de la pizza con champiñones
     */
    @Override
    public double getCost() {
        return pizza.getCost() + 600.00;
    }
}
