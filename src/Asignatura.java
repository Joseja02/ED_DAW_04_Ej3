public class Asignatura {

    public long id = 0;
    private String nombre = "";
    private int horas = 0;
    public int creditos = 0;
    private boolean disponible = false;

    public Asignatura(long id, String nombre, int horas, int creditos, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.horas = horas;
        this.creditos = creditos;
        this.disponible = disponible;
    }
}