package co.edu.uniquindio.model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private List<Empleado> listaEmpleados = new ArrayList<>();
    private List<Proyecto> listaProyectos = new ArrayList<>();
    private List<Departamento> listaDepartamentos = new ArrayList<>();
    private List<Gerente> listaGerentes = new ArrayList<>();
    private List<Tecnico> listaTecnicos = new ArrayList<>();

    public Empresa(String nombre, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }


    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public void agregarDepartamento(Departamento departamento) {
        listaDepartamentos.add(departamento);
        System.out.println("Departamento " + departamento.getNombre() + " agregado a la empresa.");
    }

    public void contratarEmpleado(Empleado empleado, Departamento departamento) {
        listaEmpleados.add(empleado);
        departamento.agregarEmpleado(empleado);

        if (empleado instanceof Gerente) listaGerentes.add((Gerente) empleado);
        if (empleado instanceof Tecnico) listaTecnicos.add((Tecnico) empleado);

        System.out.println("Empleado " + empleado.getNombre() + " contratado en " + departamento.getNombre());
    }

    public void crearProyecto(Proyecto proyecto) {
        listaProyectos.add(proyecto);
        System.out.println("Proyecto " + proyecto.getNombre() + " creado en la empresa.");
    }

    public void asignarEmpleadoAProyecto(Empleado empleado, Proyecto proyecto) {
        proyecto.registrarEmpleado(empleado);
        System.out.println("Empleado " + empleado.getNombre() + " asignado al proyecto " + proyecto.getNombre());
    }

    public void asignarGerenteAProyecto(Gerente gerente, Proyecto proyecto) {
        proyecto.setGerente(gerente);
        System.out.println("Gerente " + gerente.getNombre() + " asignado como responsable del proyecto " + proyecto.getNombre());
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




}
