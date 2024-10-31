package modelo;
/**
 * Interfaz que define el comportamiento de un estado del semáforo.
 */
public interface TrafficLightState {
    void changeState(TrafficLight trafficLight);
    void display();
}
