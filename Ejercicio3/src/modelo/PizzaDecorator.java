package modelo;

/**
 * Clase abstracta que actúa como base para los decoradores de pizza.
 */
public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;
    /**
     * Crea un nuevo decorador para una pizza
     * @param pizza la pizza a decorar
     */
    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    /**
     * Obtiene la descripción de la pizza con el decorador
     */
    @Override
    public String getDescription() {
        return pizza.getDescription();
    }
    /**
     * Calcula el costo de la pizza con el decorador
     */
    @Override
    public double getCost() {
        return pizza.getCost();
    }
}
