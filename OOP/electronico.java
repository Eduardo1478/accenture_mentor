package OOP;

public class electronico {
    private int bateria;

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public String cargarBateria(int porcentaje) {
        System.out.println("se agrego: " + porcentaje);
        return "Carga completada";
    }

    public String cargarBateria(String porcentaje) {
        System.out.println("se cargo por completo");
        return "Carga completada";
    }
}
