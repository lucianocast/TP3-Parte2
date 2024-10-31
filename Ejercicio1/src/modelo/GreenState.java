package modelo;
/**
 * Clase que representa el estado Verde del semáforo.
 */
public class GreenState implements TrafficLightState {
    @Override
    public void changeState(TrafficLight trafficLight) {
        trafficLight.setState(new YellowState());
    }

    @Override
    public void display() {
        System.out.println("Semáforo en VERDE: los autos pueden avanzar.");
    }
}
