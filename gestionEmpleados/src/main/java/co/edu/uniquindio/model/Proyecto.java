package co.edu.uniquindio.model;
import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    public String nombre;
    public int codigo;
    public Gerente gerente;
    public List<Empleado> empleadosAsignados = new ArrayList<>();

    public Proyecto(String nombre, int codigo, List<Empleado> empleadosAsignados) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.empleadosAsignados = empleadosAsignados;
    }


    public void registrarEmpleado(Empleado empleado) {
        empleadosAsignados.add(empleado);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setGerente(Gerente gerente) {
    }

    public List<Empleado> getEmpleadosAsignadosEmpleados() {
        return empleadosAsignados;
    }



    @Override
    public String toString() {
        return "Proyecto{" +
                "nombre='" + nombre + '\'' +
                ", codigo=" + codigo + '\'' +
                ", empleados=" + empleadosAsignados + '\'' +
                '}';


    }


}

