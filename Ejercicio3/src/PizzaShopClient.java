import modelo.*;

/**
 * Clase cliente que prueba la personalización de pizzas.
 */
public class PizzaShopClient {
    public static void main(String[] args) {
        // Crear pizza básica
        Pizza pizza = new BasicPizza();
        System.out.println(pizza.getDescription() + " - $" + pizza.getCost());

        // Añadir queso extra
        pizza = new CheeseDecorator(pizza);
        System.out.println(pizza.getDescription() + " - $" + pizza.getCost());

        // Añadir jamón
        pizza = new HamDecorator(pizza);
        System.out.println(pizza.getDescription() + " - $" + pizza.getCost());

        // Añadir champiñones
        pizza = new MushroomDecorator(pizza);
        System.out.println(pizza.getDescription() + " - $" + pizza.getCost());
    }
}
