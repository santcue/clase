package arreglos;

public class Cliente {
    private int cedula;
    private String nombre;

    public Cliente(int cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente=" +
                "cedula=" + cedula +
                ", nombre='" + nombre;
    }
}


