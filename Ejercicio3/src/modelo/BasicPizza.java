package modelo;

/**
 * Clase concreta que representa una pizza básica.
 */
public class BasicPizza implements Pizza {
    /**
     * Obtiene la descripción de la pizza básica
     */
    @Override
    public String getDescription() {
        return "Pizza básica";
    }
    /**
     * Calcula el costo de la pizza básica
     */
    @Override
    public double getCost() {
        return 5000.00;
    }
}
