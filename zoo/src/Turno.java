public enum Turno {
    MAÑANA("10:00 am - 16:00 pm "),NOCHE("16:00 pm - 10:00 pm");

    private String Horarios;

    Turno(String horarios) {
        Horarios = horarios;
    }

    public String getHorarios() {
        return Horarios;
    }
}
