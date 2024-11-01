package modelo;
/**
 * Clase que representa el estado Rojo del semáforo.
 */
public class RedState implements TrafficLightState{
    /**
     * Cambia el estado del semáforo a rojo
     */
    @Override
    public void changeState(TrafficLight trafficLight) {
        trafficLight.setState(new GreenState());
    }
    /**
     * Muestra un mensaje asociado con el estado del semáforo
     */
    @Override
    public void display() {
        System.out.println("Semáforo en ROJO: los autos deben detenerse.");
    }
}
