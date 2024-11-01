import modelo.*;

/**
 * Clase cliente que prueba diferentes estrategias de envío.
 */
public class ShopClient {
    /**
     * Método principal que crea pedidos con direrentes estrategias de envio
     */
    public static void main(String[] args) {
        double distance = 50;
        ShippingContext context = new ShippingContext(new RegularShipping());
        System.out.println("Costo de Envío Regular: $" + context.calculateCost(distance));
        context.setStrategy(new ExpressShipping());
        System.out.println("Costo de Envío Expreso: $" + context.calculateCost(distance));
        context.setStrategy(new InternationalShipping());
        System.out.println("Costo de Envío Internacional: $" + context.calculateCost(distance));
    }
}
