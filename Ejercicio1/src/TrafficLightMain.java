import modelo.*;
/**
 * Clase main para probar el patrón State.
 */
public class TrafficLightMain {
    /**
     * Método principal para ejecutar el cambio de estados del semáforo
     * @param args argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        for (int i = 0; i < 6; i++) {  
            trafficLight.display();
            trafficLight.changeState();
        }
    }
}

