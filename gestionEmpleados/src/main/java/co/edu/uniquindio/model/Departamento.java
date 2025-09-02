package co.edu.uniquindio.model;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    public String nombre;
    public int codigo;
    public List<Empleado> empleados = new ArrayList<>();

    public Departamento(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public Departamento() {

    }

    public String getCodigo() {
        return String.valueOf(codigo);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void agregarEmpleado(Empleado empleado) {
        if (!empleados.contains(empleado)) {
            empleados.add(empleado);
        }
    }

    public void removerEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nombre='" + nombre + '\'' +
                ", codigo=" + codigo +
                ", empleados=" + empleados +
                '}';
    }
}
