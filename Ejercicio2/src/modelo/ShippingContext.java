package modelo;

/**
 * Contexto que utiliza una estrategia de envío.
 */
public class ShippingContext {
    private ShippingStrategy strategy;

    public ShippingContext(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateCost(double distance) {
        return strategy.calculateShippingCost(distance);
    }
}
