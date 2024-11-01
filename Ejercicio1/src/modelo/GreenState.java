package modelo;
/**
 * Clase que representa el estado Verde del semáforo.
 */
public class GreenState implements TrafficLightState {
    /**
     * Cambia el estado amarillo al estado verde
     * @param trafficLight el semáforo cambia de estado
     */
    @Override
    public void changeState(TrafficLight trafficLight) {
        trafficLight.setState(new YellowState());
    }
    /**
     * Muestra el mensaje asociado con el estado del semáforo
     */
    @Override
    public void display() {
        System.out.println("Semáforo en VERDE: los autos pueden avanzar.");
    }
}
