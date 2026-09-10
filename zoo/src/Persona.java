import java.util.Objects;
import java.util.UUID;

public abstract class Persona {
    private String nombre;
    private String dni;
    private int legajo = UUID.randomUUID().hashCode();
    private double salario;

    public Persona(String nombre, String dni, double salario) {
        this.nombre = nombre;
        this.dni = dni;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", legajo=" + legajo +
                ", Salario=" + salario;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return legajo == persona.legajo && Double.compare(salario, persona.salario) == 0 && Objects.equals(nombre, persona.nombre) && Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, dni, legajo, salario);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        salario = salario;
    }
}
