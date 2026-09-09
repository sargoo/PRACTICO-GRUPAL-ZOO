public class Ave extends Animal{
    private String estado_plumaje;
    private Capacidad_Vuelo vuelo;
    private Tipo_Animal tipo;

    public Ave(String nombre, String especie, String hambre, String higiene, String salud, String estado_plumaje, Capacidad_Vuelo vuelo) {
        super(nombre, especie, hambre, higiene, salud);
        this.estado_plumaje = estado_plumaje;
        this.vuelo = vuelo;
        this.tipo = tipo.AVE;
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
                "estado_plumaje='" + estado_plumaje + '\'' +
                ", vuelo=" + vuelo +
                "} " ;
    }

    public String getEstado_plumaje() {
        return estado_plumaje;
    }

    public Capacidad_Vuelo getVuelo() {
        return vuelo;
    }

    public Tipo_Animal getTipo() {
        return tipo;
    }
}
