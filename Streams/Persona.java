package Streams;

public class Persona {

    private String nombre;
    private String telefono;
    private Integer edad;
    private String ciudad;
    private String nivel; 
    private double sueldo;

    public Persona(String nombre, String telefono, Integer edad, String ciudad, String nivel, Double sueldo){
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
        this.ciudad = ciudad;
        this.nivel = nivel;
        this.sueldo = sueldo;
    }

    // Getters and setters
    public String getNombre() { 
        return nombre;
    }
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    public String getTelefono() { 
        return telefono; 
    }
    public void setTelefono(String telefono) { 
        this.telefono = telefono; 
    }

    public Integer getEdad() { 
        return edad; 
    }
    public void setEdad(Integer edad) {
        this.edad = edad; 
    }

    public String getCiudad() {
        return ciudad; 
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad; 
    }

    public String getNivel() {
        return nivel; 
    }
    public void setNivel(String nivel) {
        this.nivel = nivel; 
    }

    public Double getSueldo() {
        return sueldo; 
    }
    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo; 
    }

    @Override
    public String toString() {
    return "Persona: {" +
            "nombre='" + nombre + '\'' +
            ", telefono='" + telefono + '\'' +
            ", edad=" + edad +
            ", ciudad='" + ciudad + '\'' +
            ", nivel='" + nivel + '\'' +
            ", sueldo=" + sueldo +
            "}" + 
            "\n";
    }        
}
