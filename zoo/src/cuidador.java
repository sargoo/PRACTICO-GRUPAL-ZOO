import java.util.Objects;

public class Cuidador  extends  Persona{
    private Tipo_Animal especialidad ;
    private Area_del_Zoo area;
    private Turno t;

    public Cuidador(String nombre, String dni, double salario, Tipo_Animal especialidad, Area_del_Zoo area, Turno t) {
        super(nombre, dni, salario);
        this.especialidad = especialidad;
        this.area = area;
        this.t = t;
    }

    public String alimentar(){
        return "Alimentando animal...";
    };

    public String Vacunar(){
       return  "Animal Vacunado...";
    }

    public String Limpiando(){
        return "Animal limpio...";
    }

    @Override
    public String toString() {
        return "Cuidador{" +  super.toString() +
                "especialidad=" + especialidad +
                ", area=" + area +
                ", t=" + t +
                "} " ;
    }

    public Tipo_Animal getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Tipo_Animal especialidad) {
        this.especialidad = especialidad;
    }

    public Area_del_Zoo getArea() {
        return area;
    }

    public void setArea(Area_del_Zoo area) {
        this.area = area;
    }

    public Turno getT() {
        return t;
    }

    public void setT(Turno t) {
        this.t = t;
    }
}
