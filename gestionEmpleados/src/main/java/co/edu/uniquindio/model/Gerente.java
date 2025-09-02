package co.edu.uniquindio.model;

import java.util.List;

public class Gerente extends Empleado implements IContribuyente {
    private Proyecto gerenteAsociado;
    private List<Proyecto> proyectosGestionados;

    public Gerente(String nombre, int idEmpleado, String departamento) {
        super(nombre, idEmpleado, departamento);
        this.proyectosGestionados = proyectosGestionados;
    }
    public void gestionarProyecto(Proyecto proyecto) {
        proyectosGestionados.add(proyecto);
        System.out.println(getNombre() +
                " ahora gestiona el proyecto "
                + proyecto.getNombre());
    }

    @Override
    public void contribuir(Proyecto proyecto) {
        System.out.println("El gerente " + getNombre() +
                " contribuye planificando y liderando el proyecto "
                + proyecto.getNombre());
    }
}

