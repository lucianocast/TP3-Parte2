package modelo;

/**
 * Interfaz que define el método de cálculo de costo de envío.
 */
public interface ShippingStrategy {
    /**
     * Calcula el costo de envío para un pedido
     * @param distance la distancia en kilómetros
     * @return el costo del envío
     */
    double calculateShippingCost(double distance);
}
