package modelo;
/**
 * Clase que representa el estado Rojo del semáforo.
 */
public class RedState implements TrafficLightState{
    @Override
    public void changeState(TrafficLight trafficLight) {
        trafficLight.setState(new GreenState());
    }

    @Override
    public void display() {
        System.out.println("Semáforo en ROJO: los autos deben detenerse.");
    }
}
