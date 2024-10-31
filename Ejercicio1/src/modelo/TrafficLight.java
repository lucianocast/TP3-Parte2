package modelo;
/**
 * Clase que representa el semáforo, que cambia entre los estados Rojo, Amarillo y Verde.
 */
public class TrafficLight {
    private TrafficLightState state;

    public TrafficLight() {
        this.state = new RedState(); // Estado inicial
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void changeState() {
        state.changeState(this);
    }

    public void display() {
        state.display();
    }
}
