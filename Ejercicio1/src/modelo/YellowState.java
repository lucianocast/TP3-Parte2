package modelo;
/**
 * Clase que representa el estado Amarillo del semáforo.
 */
public class YellowState implements TrafficLightState {
    /**
     * Cambia el estado de rojo a el estado amarillo
     */
    @Override
    public void changeState(TrafficLight trafficLight) {
        trafficLight.setState(new RedState());
    }
    /**
     * Mensaje asociado al cambio de estado del semáforo
     */
    @Override
    public void display() {
        System.out.println("Semáforo en AMARILLO: precaución, el semáforo cambiará.");
    }
}
