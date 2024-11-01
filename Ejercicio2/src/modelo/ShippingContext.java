package modelo;

/**
 * Contexto que utiliza una estrategia de envío.
 */
public class ShippingContext {
    private ShippingStrategy strategy;
    /**
     * Constructor de la clase que inicializa el contexto con una estrategia
     * @param strategy la estrategia de envío a utilizar
     */
    public ShippingContext(ShippingStrategy strategy) {
        this.strategy = strategy;
    }
    /**
     * Establece una nueva estrategia de envío para el contexto
     */
    public void setStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }
    /**
     * Calcula el costo de envío utilizando la estrategia actual y la distancia
     * @param distance la distancia a la que se enviará el paquete
     * @return el costo calculado de envío segun la estrategia
     */
    public double calculateCost(double distance) {
        return strategy.calculateShippingCost(distance);
    }
}
