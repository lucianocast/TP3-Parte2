package modelo;

/**
 * Estrategia de envío regular.
 */
public class RegularShipping implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double distance) {
        return 5 + distance * 1.0;
    }
}
