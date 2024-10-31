import modelo.*;
/**
 * Clase main para probar el patrón State.
 */
public class TrafficLightMain {
    public static void main(String[] args) {
        // Crear una instancia del semáforo
        TrafficLight trafficLight = new TrafficLight();

        // Simular el cambio de estados en el ciclo de un semáforo
        for (int i = 0; i < 6; i++) {  
            trafficLight.display();
            trafficLight.changeState();
        }
    }
}

