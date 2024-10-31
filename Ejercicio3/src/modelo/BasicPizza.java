package modelo;

/**
 * Clase concreta que representa una pizza básica.
 */
public class BasicPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Pizza básica";
    }

    @Override
    public double getCost() {
        return 5000.00;
    }
}
