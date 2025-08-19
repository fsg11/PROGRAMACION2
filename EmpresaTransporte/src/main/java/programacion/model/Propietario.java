package programacion.model;

public class Propietario {
    private String nombre;
    private String numeroidentificacion;
    private String gmail;
    private String numeroCelular;

    public Propietario() {
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroidentificacion() {
        return numeroidentificacion;
    }
    public void setNumeroidentificacion(String numeroidentificacion) {
        this.numeroidentificacion = numeroidentificacion;
    }

    public String getGmail() {
        return gmail;
    }
    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }
    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                ", numeroidentificacion='" + numeroidentificacion + '\'' +
                ", gmail='" + gmail + '\'' +
                ", numeroCelular='" + numeroCelular + '\'' +
                '}';
    }
}
