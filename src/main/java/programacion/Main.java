package programacion;

import programacion.ModelFactory.ModelFactory;
import programacion.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Propietario> propietarios = new ArrayList<>();
    private static List<Vehiculo> vehiculos = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("SISTEMA DE TRANSPORTE");


        ejercicio1_inicializarDatosPrueba();
        mostrarTodosLosDatos();

        System.out.println("\n" + "=".repeat(50));
        ejercicio2_crearPropietarioYVehiculoCarga();

        System.out.println("\n" + "=".repeat(50));
        ejercicio3_calcularTotalPasajeros();

        System.out.println("\n" + "=".repeat(50));
        buscarPropietariosPorPeso(10000);

        System.out.println("\n" + "=".repeat(50));
        buscarUsuariosPorPlaca("BUS001");

        System.out.println("\n" + "=".repeat(50));
        buscarPropietariosMayores40();
    }

    public static void ejercicio1_inicializarDatosPrueba() {
        System.out.println("=== EJERCICIO 1: INICIALIZAR DATOS DE PRUEBA ===");

        Propietario p1 = ModelFactory.crearPropietario("Juan Pérez", "12345678", "juan@email.com", "3001234567");
        Propietario p2 = ModelFactory.crearPropietario("María García", "87654321", "maria@email.com", "3007654321");
        Propietario p3 = ModelFactory.crearPropietario("Carlos López", "11223344", "carlos@email.com", "3001122334");
        Propietario p4 = ModelFactory.crearPropietario("Ana Martínez", "44332211", "ana@email.com", "3004433221");
        Propietario p5 = ModelFactory.crearPropietario("Pedro Rodríguez", "55667788", "pedro@email.com", "3005566778");

        propietarios.add(p1);
        propietarios.add(p2);
        propietarios.add(p3);
        propietarios.add(p4);
        propietarios.add(p5);

        VehiculoCarga vc1 = ModelFactory.crearVehiculoCarga("ABC123", "2020", "Volvo", "Blanco", p1, 15000, 3);
        VehiculoCarga vc2 = ModelFactory.crearVehiculoCarga("DEF456", "2019", "Mercedes", "Azul", p2, 8000, 2);
        VehiculoCarga vc3 = ModelFactory.crearVehiculoCarga("GHI789", "2021", "Scania", "Rojo", p3, 12000, 3);

        vehiculos.add(vc1);
        vehiculos.add(vc2);
        vehiculos.add(vc3);

        VehiculoPasajeros vp1 = ModelFactory.crearVehiculoPasajeros("BUS030", "2020", "Toyota", "Gris", p4, 45);
        VehiculoPasajeros vp2 = ModelFactory.crearVehiculoPasajeros("BUS05", "2018", "Chevrolet", "Verde", p5, 30);
        VehiculoPasajeros vp3 = ModelFactory.crearVehiculoPasajeros("BUS2025", "2021", "Ford", "Negro", p1, 20);

        vehiculos.add(vp1);
        vehiculos.add(vp2);
        vehiculos.add(vp3);

        System.out.println("✓ Datos de prueba creados exitosamente usando ModelFactory");
        System.out.println("✓ 5 propietarios creados");
        System.out.println("✓ 3 vehículos de carga creados");
        System.out.println("✓ 3 vehículos de pasajeros creados");
    }

    public static void ejercicio2_crearPropietarioYVehiculoCarga() {
        System.out.println("=== EJERCICIO 2: CREAR PROPIETARIO Y VEHÍCULO DE CARGA ===");

        Propietario nuevoPropietario = ModelFactory.crearPropietario(
                "Roberto Silva", "77889900", "roberto@email.com", "3007788990"
        );
        propietarios.add(nuevoPropietario);

        VehiculoCarga nuevoVehiculo = ModelFactory.crearVehiculoCarga(
                "RST901", "2023", "Peterbilt", "Plateado", nuevoPropietario, 2000, 4
        );
        vehiculos.add(nuevoVehiculo);

        System.out.println("✓ Nuevos objetos creados usando ModelFactory:");
        System.out.println("  Propietario: " + nuevoPropietario);
        System.out.println("  Vehículo: " + nuevoVehiculo);
    }

    public static void ejercicio3_calcularTotalPasajeros() {
        System.out.println("=== EJERCICIO 3: CALCULAR TOTAL DE PASAJEROS TRANSPORTADOS ===");

        List<VehiculoPasajeros> vehiculosPasajeros = new ArrayList<>();
        for (Vehiculo v : vehiculos) {
            if (v instanceof VehiculoPasajeros) {
                vehiculosPasajeros.add((VehiculoPasajeros) v);
            }
        }

        if (vehiculosPasajeros.isEmpty()) {
            System.out.println("No hay vehículos de pasajeros registrados.");
            return;
        }

        VehiculoPasajeros vehiculo = vehiculosPasajeros.get(0);
        int numeroViajes = 5;
        int totalPasajeros = vehiculo.getNumeroMaximoPasajeros() * numeroViajes;

        System.out.println("Vehículo seleccionado: " + vehiculo.getPlaca());
        System.out.println("Capacidad máxima: " + vehiculo.getNumeroMaximoPasajeros() + " pasajeros");
        System.out.println("Número de viajes: " + numeroViajes);
        System.out.println("✓ Total de pasajeros transportados: " + totalPasajeros);

        System.out.println("\nTodos los vehículos de pasajeros:");
        for (VehiculoPasajeros vp : vehiculosPasajeros) {
            int pasajeros = vp.getNumeroMaximoPasajeros() * numeroViajes;
            System.out.println("- " + vp.getPlaca() + ": " + pasajeros + " pasajeros en " + numeroViajes + " viajes");
        }
    }

    public static void mostrarTodosLosDatos() {
        System.out.println("\n=== DATOS CREADOS ===");

        System.out.println("\n--- PROPIETARIOS ---");
        for (Propietario p : propietarios) {
            System.out.println(p);
        }

        System.out.println("\n--- VEHÍCULOS ---");
        for (Vehiculo v : vehiculos) {
            System.out.println(v);
        }
    }

    public static void buscarPropietariosPorPeso(double pesoMinimo) {
        System.out.println("=== BUSCAR PROPIETARIOS POR PESO ===");
        System.out.println("Buscando propietarios con vehículos que superan " + pesoMinimo + " kg:");

        boolean encontrados = false;
        for (Vehiculo v : vehiculos) {
            if (v instanceof VehiculoCarga) {
                VehiculoCarga vc = (VehiculoCarga) v;
                if (vc.getCapacidadCarga() > pesoMinimo) {
                    System.out.println("✓ " + vc.getPropietario().getNombre() +
                            " - Vehículo: " + vc.getPlaca() +
                            " - Capacidad: " + vc.getCapacidadCarga() + " kg");
                    encontrados = true;
                }
            }
        }

        if (!encontrados) {
            System.out.println("✗ No se encontraron propietarios con vehículos que superen ese peso.");
        }
    }

    public static void buscarUsuariosPorPlaca(String placaBuscada) {
        System.out.println("=== BUSCAR USUARIOS POR PLACA ===");
        System.out.println("Buscando vehículo con placa: " + placaBuscada);

        boolean encontrado = false;
        for (Vehiculo v : vehiculos) {
            if (v.getPlaca().equalsIgnoreCase(placaBuscada)) {
                if (v instanceof VehiculoPasajeros) {
                    VehiculoPasajeros vp = (VehiculoPasajeros) v;
                    System.out.println("✓ Vehículo encontrado:");
                    System.out.println("  Placa: " + vp.getPlaca());
                    System.out.println("  Propietario: " + vp.getPropietario().getNombre());
                    System.out.println("  Capacidad máxima: " + vp.getNumeroMaximoPasajeros() + " pasajeros");
                } else {
                    System.out.println("✓ Vehículo encontrado pero es de carga, no transporta pasajeros.");
                }
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("✗ No se encontró vehículo con la placa " + placaBuscada);
        }
    }

    public static void buscarPropietariosMayores40() {
        System.out.println("=== PROPIETARIOS MAYORES DE 40 AÑOS ===");
        System.out.println("Simulando edades para los propietarios:");

        int[] edades = {45, 32, 48, 38, 42, 35};

        for (int i = 0; i < propietarios.size() && i < edades.length; i++) {
            Propietario p = propietarios.get(i);
            int edad = edades[i];

            System.out.print("- " + p.getNombre() + " (edad simulada: " + edad + " años)");
            if (edad > 40) {
                System.out.println(" ✓ Mayor de 40");
            } else {
                System.out.println(" ✗ Menor de 40");
            }
        }
    }
}