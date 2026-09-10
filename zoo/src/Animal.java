public abstract  class Animal {
    private String nombre;
    private boolean hambre ;
    private boolean salud;
    private boolean higiene;
    private Tipo_Animal tipoAnimal;

    public Animal(String nombre, boolean hambre, boolean higiene, boolean salud, Tipo_Animal tipoAnimal) {
        this.nombre = nombre;
        this.hambre = false;
        this.higiene = false;
        this.salud = false;
        this.tipoAnimal = tipoAnimal;
    }

    public String comer(){
            return "Comiendo";
    }

    public String enfermarse(){
        return "enfermo";
    }

    public String ensucierse(){
        return "sucio";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getHambre() {
        return hambre;
    }

    public void setHambre(boolean hambre) {
        this.hambre = hambre;
    }

    public boolean getSalud() {
        return salud;
    }

    public void setSalud(boolean salud) {
        this.salud = salud;
    }

    public boolean getHigiene() {
        return higiene;
    }

    public void setHigiene(boolean higiene) {
        this.higiene = higiene;
    }

    public Tipo_Animal getTipoAnimal() {
        return tipoAnimal;
    }
}
