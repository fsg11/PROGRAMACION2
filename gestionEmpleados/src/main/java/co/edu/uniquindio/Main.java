package co.edu.uniquindio;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import co.edu.uniquindio.model.Departamento;
import co.edu.uniquindio.model.Empleado;
import co.edu.uniquindio.model.Gerente;
import co.edu.uniquindio.model.Tecnico;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Empleado empleado = new Empleado();
        Departamento departamento = new Departamento();
        Tecnico tecnico = new Tecnico();





        System.out.print("Ingrese código de departamento: ");
        String codDepto = sc.nextLine();
        System.out.print("Ingrese nombre de departamento: ");
        String nomDepto = sc.nextLine();

        System.out.print("Ingrese nombre del empleado: ");
        String nomEmpleado = sc.nextLine();
        System.out.print("Ingrese id del empleado: ");
        int idEmpleado = sc.nextInt();
        System.out.print("Ingrese departamento del empleado: ");
        String departamentoEmpleado = sc.nextLine();
        System.out.print("Ingrese especialidad del tecnico: ");
        String especialidadTecnico = sc.nextLine();

        Empleado empleado1 = new Empleado(nomEmpleado, idEmpleado, departamentoEmpleado);
        Tecnico tecnico1 = new Tecnico(nomEmpleado, idEmpleado, departamentoEmpleado, especialidadTecnico);
        Gerente gerente = new Gerente(nomEmpleado, idEmpleado, departamentoEmpleado);
        Departamento departamento1 = new Departamento(nomDepto, Integer.parseInt(codDepto));
        departamento1.agregarEmpleado(empleado1);
        departamento1.agregarEmpleado(tecnico1);
        departamento1.agregarEmpleado(gerente);






    }
            }
