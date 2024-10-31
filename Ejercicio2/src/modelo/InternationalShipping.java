package modelo;

/**
 * Estrategia de envío internacional.
 */
public class InternationalShipping implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double distance) {
        return 20 + distance * 3.5;
    }
}
