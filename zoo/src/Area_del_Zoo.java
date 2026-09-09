public enum Area_del_Zoo {
    SABANA("Zona Norte - Mamiferos Grandes "),
    ACUARIO("Zona Sur - Seres Marinos"),
    AVIARIO("Zona Este - Aves"),
    REPTILIANOS("Zona Oeste - Zona de reptiles");

    private String descripcion;

    Area_del_Zoo(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
