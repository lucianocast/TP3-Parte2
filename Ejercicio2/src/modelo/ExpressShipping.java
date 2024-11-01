package modelo;

/**
 * Clase que representa la estrategia de envío expreso.
 */
public class ExpressShipping implements ShippingStrategy {
    /**
     * Calcula el costo de envío expreso en base a la distancia
     */
    @Override
    public double calculateShippingCost(double distance) {
        return 10 + distance * 2.0;
    }
}
