import modelo.*;

/**
 * Clase cliente que prueba diferentes estrategias de envío.
 */
public class ShopClient {
    public static void main(String[] args) {
        double distance = 50; // distancia de envío en km

        // Envío regular
        ShippingContext context = new ShippingContext(new RegularShipping());
        System.out.println("Costo de Envío Regular: $" + context.calculateCost(distance));

        // Envío expreso
        context.setStrategy(new ExpressShipping());
        System.out.println("Costo de Envío Expreso: $" + context.calculateCost(distance));

        // Envío internacional
        context.setStrategy(new InternationalShipping());
        System.out.println("Costo de Envío Internacional: $" + context.calculateCost(distance));
    }
}
