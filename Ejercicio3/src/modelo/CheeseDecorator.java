package modelo;

/**
 * Decorador que añade queso extra a la pizza.
 */
public class CheeseDecorator extends PizzaDecorator {
    /**
     * Crea un decorador de queso para una pizza
     * @param pizza la pizza a decorar con queso extra
     */
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }
    /**
     * Obtiene la descripción de la pizza con queso extra
     */
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Queso extra";
    }
    /**
     * Calcula el costo de la pizza con queso extra
     * @return el costo de la pizza con queso extra
     */
    @Override
    public double getCost() {
        return pizza.getCost() + 550.00;
    }
}
