package modelo;

/**
 * Clase que representa la estrategia de envío internacional.
 */
public class InternationalShipping implements ShippingStrategy {
    /**
     * Calcula el costo de envío internacional en base a la distancia
     */
    @Override
    public double calculateShippingCost(double distance) {
        return 20 + distance * 3.5;
    }
}
