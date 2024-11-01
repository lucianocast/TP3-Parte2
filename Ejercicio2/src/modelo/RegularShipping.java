package modelo;

/**
 * Clase que representa la estrategia de envío regular.
 */
public class RegularShipping implements ShippingStrategy {
    /**
     * Calcula el costo del envio regular en base a la distancia
     */
    @Override
    public double calculateShippingCost(double distance) {
        return 5 + distance * 1.0;
    }
}
