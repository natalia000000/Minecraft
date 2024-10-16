public class Cazador extends Jugador implements AccionBonus{

    private int enemigosCazados;

    public Cazador(String nombre, int salud, int enemigosCazados){
        super(nombre, salud);
        this.enemigosCazados = enemigosCazados;
        
    }
    
}
