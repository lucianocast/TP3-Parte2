import modelo.*;

/**
 * Clase cliente que prueba la personalización de pizzas.
 */
public class PizzaShopClient {
    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();
        System.out.println(pizza.getDescription() + " - $" + pizza.getCost());
        pizza = new CheeseDecorator(pizza);
        System.out.println(pizza.getDescription() + " - $" + pizza.getCost());
        pizza = new HamDecorator(pizza);
        System.out.println(pizza.getDescription() + " - $" + pizza.getCost());
        pizza = new MushroomDecorator(pizza);
        System.out.println(pizza.getDescription() + " - $" + pizza.getCost());
    }
}
