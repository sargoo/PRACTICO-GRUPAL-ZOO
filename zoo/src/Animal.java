import java.util.Objects;

public abstract  class Animal {
    private String nombre;
    private String especie;
    private String hambre;
    private String salud;
    private String higiene;

    public Animal(String nombre, String especie, String hambre, String higiene, String salud) {
        this.nombre = nombre;
        this.especie = especie;
        this.hambre = hambre;
        this.higiene = higiene;
        this.salud = salud;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", hambre='" + hambre + '\'' +
                ", salud='" + salud + '\'' +
                ", higiene='" + higiene + '\'' ;
    }



    public abstract String comer();

    public abstract String enfermarse();

    public abstract String ensucierse();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(nombre, animal.nombre) && Objects.equals(especie, animal.especie) && Objects.equals(hambre, animal.hambre) && Objects.equals(salud, animal.salud) && Objects.equals(higiene, animal.higiene);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, especie, hambre, salud, higiene);
    }

    //atributos mínimos:  nombre, especie, hambre, salud, higiene, .
    //Métodos mínimos: comer(), enfermarse(), ensuciarse().

}
