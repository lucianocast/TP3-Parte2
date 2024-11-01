package modelo;
/**
 * Clase que representa el semáforo, que cambia entre los estados Rojo, Amarillo y Verde.
 */
public class TrafficLight {
    /**
     * Estado actual del semáforo
     */
    private TrafficLightState state;
    /**
     * Constructor que inicializa el semáforo en estado rojo
     */
    public TrafficLight() {
        this.state = new RedState();
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }
    /**
     * Cambia el estado del semáforo al siguiente
     */
    public void changeState() {
        state.changeState(this);
    }
    /**
     * Muestra el mensaje asociado al estado actual del semáforo
     */
    public void display() {
        state.display();
    }
}
