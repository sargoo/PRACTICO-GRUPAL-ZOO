import java.util.Objects;

public abstract class Persona {
    private String nombre;
    private String dni;
    private int legajo;
    private double Salario;

    public Persona(String nombre, String dni, double salario, int legajo) {
        this.nombre = nombre;
        this.dni = dni;
        Salario = salario;
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", legajo=" + legajo +
                ", Salario=" + Salario;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return legajo == persona.legajo && Double.compare(Salario, persona.Salario) == 0 && Objects.equals(nombre, persona.nombre) && Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, dni, legajo, Salario);
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
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }
}
