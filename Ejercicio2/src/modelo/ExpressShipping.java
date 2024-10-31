package modelo;

/**
 * Estrategia de envío expreso.
 */
public class ExpressShipping implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double distance) {
        return 10 + distance * 2.0;
    }
}
