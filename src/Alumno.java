public class Alumno {
    public long id = 0;
    public String nombre = "";
    public String apellidos = "";
    public String dni = "";
    public int curso = 0;

    public Alumno(long id, String nombre, String apellidos, String dni, int curso) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.curso = curso;
    }
}