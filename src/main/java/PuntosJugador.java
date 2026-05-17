import java.util.HashMap;
import java.util.Map;

public class PuntosJugador {
    private Map<String, Integer> jugadores = new HashMap<>();
    public Map<String, Integer> getJugadores() {
        return jugadores;
    }

    public PuntosJugador (Map<String, Integer> jugadores) {
        this.jugadores = jugadores;
    }

    public void sumarPuntos(String jugador, int puntos) {
        jugadores.put(jugador, jugadores.get(jugador) + puntos);
    }
}