import modelo.*;
/**
 * Clase main para probar el patrón State.
 */
public class TrafficLightMain {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        for (int i = 0; i < 6; i++) {  
            trafficLight.display();
            trafficLight.changeState();
        }
    }
}

