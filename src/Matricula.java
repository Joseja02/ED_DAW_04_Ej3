import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Matricula {

    public List<Alumno> alumnos;
    private List<Asignatura> asignaturas;

    public Matricula(){}

    public Matricula(List<Asignatura> asignaturas, List<Alumno> alumnos) {
        this.alumnos = alumnos;
        this.asignaturas = asignaturas;
    }

    public float costeMatricula(){

        float coste = 0;
        int creditos = 0;

        for (Asignatura elemento : asignaturas) {
            creditos = creditos + elemento.creditos;
        }

        coste = creditos * 15;
        return coste;
    }
}