import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

public class PuntosJugadorTest {
    @Test
    public void testAdd() {
        HashMap<String, Integer> jugadores = new HashMap<>();
        jugadores.put("jugador1", 10);

        PuntosJugador puntosJugador = new PuntosJugador(jugadores);
        puntosJugador.sumarPuntos("jugador1", 10);

        assertTrue(puntosJugador.getJugadores().get("jugador1") == 20);
    }
}