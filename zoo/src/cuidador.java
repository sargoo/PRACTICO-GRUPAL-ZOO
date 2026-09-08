public class cuidador {
   private Especialidad especialidad;

    public cuidador(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public String alimentar(){
        return "El animal fue alimentado";
    }

    public String vacunar(){
        return  "El animal fue vacunado";
    }

    public String limpiar(){
        return  "El animal fue limpiado";
    }
    

}
