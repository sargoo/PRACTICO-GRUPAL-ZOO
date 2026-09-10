public class Mamifero extends Animal{
    private Tipo_Animal tipo;
    private Tipo_Pelaje pelaje;

    public Mamifero(String nombre, boolean hambre, boolean higiene, boolean salud, Tipo_Animal tipoAnimal, Tipo_Pelaje pelaje) {
        super(nombre, hambre, higiene, salud, tipoAnimal);
        this.pelaje = pelaje;
    }

    @Override
    public String toString() {
        return   super.toString() +
                "tipo=" + tipo +
                ", pelaje=" + pelaje +
                "} " ;
    }

    @Override
    public String comer() {
        return "Mamifero comiendo...";
    }

    @Override
    public String ensucierse() {
        return "El Mamifero necesita un baño...";
    }

    @Override
    public String enfermarse() {
        return "El Mamifero parece enfermo...";
    }

    public Tipo_Animal getTipo() {
        return tipo;
    }

    public Tipo_Pelaje getPelaje() {
        return pelaje;
    }

    public void setPelaje(Tipo_Pelaje pelaje) {
        this.pelaje = pelaje;
    }
}
