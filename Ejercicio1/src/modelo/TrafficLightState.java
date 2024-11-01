package modelo;
/**
 * Interfaz que define el comportamiento de un estado del semáforo.
 */
public interface TrafficLightState {
    /**
     * Cambia al siguiente estado del semáforo
     * @param trafficLight el objeto semáforo que cambia de estado
     */
    void changeState(TrafficLight trafficLight);
    /**
     * Devuelve una representacipn en cadena del estado actual
     * @return el nombre del estado
     */
    void display();
}
