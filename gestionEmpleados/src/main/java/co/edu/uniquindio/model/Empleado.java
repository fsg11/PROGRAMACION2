package co.edu.uniquindio.model;

public class Empleado {
    public String nombre;
    public int idEmpleado;
    public String departamento;
    public Departamento departamentoAsociado;
    public Proyecto proyectoAsociado;

    public Empleado(String nombre, int idEmpleado, String departamento) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.departamento = departamento;
    }

    public Empleado() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setId(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Departamento getDepartamentoAsociado() {
        return departamentoAsociado;
    }

    public Proyecto getProyectoAsociado() {
        return proyectoAsociado;
    }

    public void setProyectoAsociado(Proyecto proyecto) {
        this.proyectoAsociado = proyecto;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", idEmpleado=" + idEmpleado +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}
