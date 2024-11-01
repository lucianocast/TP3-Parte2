package modelo;

/**
 * Interfaz que representa una pizza.
 */
public interface Pizza {
    /**
     * Obtiene la descripción de la pizza
     * @return la descripción de la pizza
     */
    String getDescription();
    /**
     * Calcula el costo de la pizza
     * @return el costo de la pizza
     */
    double getCost();
}
