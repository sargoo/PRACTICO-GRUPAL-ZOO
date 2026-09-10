public class Ave extends Animal{
    private Capacidad_Vuelo vuelo;
    private Tipo_Animal tipo;

    public Ave(String nombre, boolean hambre, boolean higiene, boolean salud, Tipo_Animal tipoAnimal, Capacidad_Vuelo vuelo) {
        super(nombre, hambre, higiene, salud, tipoAnimal);
        this.vuelo = vuelo;
    }

    @Override
    public String comer() {
        return "Ave comiendo...";
    }

    @Override
    public String ensucierse() {
        return "El Ave necesita un baño...";
    }

    @Override
    public String enfermarse() {
        return "El Ave parece enferma...";
    }

    @Override
    public String toString() {
        return "Ave{" + super.toString() +
                ", vuelo=" + vuelo +
                "} " ;
    }


    public Capacidad_Vuelo getVuelo() {
        return vuelo;
    }

    public Tipo_Animal getTipo() {
        return tipo;
    }
}
