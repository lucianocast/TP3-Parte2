package modelo;

/**
 * Decorador que añade jamón a la pizza.
 */
public class HamDecorator extends PizzaDecorator {
    /**
     * Crea un decorador de jamón para una pizza
     * @param pizza la pizza a decorar con jamón
     */
    public HamDecorator(Pizza pizza) {
        super(pizza);
    }
    /**
     * Obtiene la descripción de la pizza con jamón
     */
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Jamón";
    }
    /**
     * Calcula el costo de la pizza con jamón
     */
    @Override
    public double getCost() {
        return pizza.getCost() + 700.00;
    }
}
