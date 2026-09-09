public class Reptil extends Animal{
    private boolean Venenoso;
    private boolean camina;
    private Tipo_Animal tipo;

    public Reptil(String nombre, String especie, String hambre, String higiene, String salud, boolean venenoso, boolean camina) {
        super(nombre, especie, hambre, higiene, salud);
        this.Venenoso = venenoso;
        this.camina = camina;
        this.tipo = tipo.REPTIL;
    }

    @Override
    public String comer() {
        return "Reptil comiendo...";
    }

    @Override
    public String ensucierse() {
        return "El Reptil necesita un baño...";
    }

    @Override
    public String enfermarse() {
        return "El Reptil parece enfermo...";
    }


    @Override
    public String toString() {
        return "Reptil{" + super.toString() +
                "Venenoso=" + Venenoso +
                ", camina=" + camina +
                "} ";
    }

    public Tipo_Animal getTipo() {
        return tipo;
    }

    public boolean isVenenoso() {
        return Venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        Venenoso = venenoso;
    }

    public boolean isCamina() {
        return camina;
    }

    public void setCamina(boolean camina) {
        this.camina = camina;
    }
}
