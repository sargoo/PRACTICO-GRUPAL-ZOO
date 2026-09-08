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

    public void comer(){

    }

    public void enfermarse(){

    }

    public void ensucierse(){
        
    }

    //atributos mínimos:  nombre, especie, hambre, salud, higiene, .
    //Métodos mínimos: comer(), enfermarse(), ensuciarse().

}
