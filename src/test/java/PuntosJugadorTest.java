import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;
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
    @Test
    public void testRestarPuntos(){
        HashMap<String, Integer> jugadores = new HashMap<>();
        jugadores.put("jugador1", 10);
        PuntosJugador puntosJugador = new PuntosJugador(jugadores);
        puntosJugador.restarPuntos("jugador1",4);
        assertTrue(puntosJugador.getJugadores().get("jugador1")==6);
    }
    @Test
    public void testConsultarJugador(){
      HashMap<String, Integer> jugadores = new HashMap<>();
        jugadores.put("jugador1", 10);
        PuntosJugador puntosJugador = new PuntosJugador(jugadores);  
        assertTrue(puntosJugador.obtenerPuntos("jugador1")==10);
    }
    
    @Test
    public void testReset() {
        HashMap<String, Integer> jugadores = new HashMap<>();
        jugadores.put("jugador1", 10);

        PuntosJugador puntosJugador = new PuntosJugador(jugadores);

        puntosJugador.resetearPuntos("jugador1");
        assertTrue(puntosJugador.getJugadores().get("jugador1") == 0);
    }
}