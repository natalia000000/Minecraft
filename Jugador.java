public abstract class Jugador{
    //Atributos
    protected String nombre;
    protected int salud;


    //
    public Jugador(String nombre, int salud){
        this.nombre = nombre;
        this.salud = salud;

    }

    public abstract int calcularPuntos();

    public final void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Salud: " + salud);
    }
}