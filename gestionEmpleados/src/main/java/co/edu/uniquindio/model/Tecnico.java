package co.edu.uniquindio.model;

public class Tecnico extends Empleado implements IContribuyente {
    private String especialidad;

    public Tecnico(String nombre, int idEmpleado, String departamento, String especialidad) {
        super(nombre, idEmpleado, departamento);
        this.especialidad = especialidad;
    }

    public Tecnico() {

    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }



    @Override
    public void contribuir(Proyecto proyecto) {
        System.out.println("El técnico " + getNombre() +
                " contribuye planificando y liderando el proyecto "
                + proyecto.getNombre());
    }
}
