package modelo;

/**
 * Interfaz que define el método de cálculo de costo de envío.
 */
public interface ShippingStrategy {
    double calculateShippingCost(double distance);
}
