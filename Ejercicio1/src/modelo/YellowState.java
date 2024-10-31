package modelo;
/**
 * Clase que representa el estado Amarillo del semáforo.
 */
public class YellowState implements TrafficLightState {
    @Override
    public void changeState(TrafficLight trafficLight) {
        trafficLight.setState(new RedState());
    }

    @Override
    public void display() {
        System.out.println("Semáforo en AMARILLO: precaución, el semáforo cambiará.");
    }
}
