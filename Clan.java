import java.util.ArrayList;

public class Clan {
    private String nombre;
    private ArrayList<Jugador> jugadores;

    //Constructores
    public Clan (String nombre){
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
    }

    public int calcularTotalPuntos(){
        int total = 0;
        for (Jugador jugador : jugadores){
            total += jugador.calcularPuntos();

        }
        
    }
}
