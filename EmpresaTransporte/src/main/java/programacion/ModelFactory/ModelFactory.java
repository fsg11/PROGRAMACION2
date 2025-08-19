package programacion.ModelFactory;

import programacion.model.Propietario;
import programacion.model.VehiculoCarga;
import programacion.model.VehiculoPasajeros;

public class ModelFactory {

    public static Propietario crearPropietario(String nombre, String numeroidentificacion, String gmail, String celular) {
        Propietario propietario = new Propietario();
        propietario.setNombre(nombre);
        propietario.setNumeroidentificacion(numeroidentificacion);
        propietario.setGmail(gmail);
        propietario.setNumeroCelular(celular);
        return propietario;
    }

    public static VehiculoCarga crearVehiculoCarga(String placa, String modelo, String marca,
                                                   String color, Propietario propietario,
                                                   double capacidadCarga, int numeroEjes) {
        VehiculoCarga vehiculo = new VehiculoCarga();
        vehiculo.setPlaca(placa);
        vehiculo.setModelo(modelo);
        vehiculo.setMarca(marca);
        vehiculo.setColor(color);
        vehiculo.setPropietario(propietario);
        vehiculo.setCapacidadCarga(capacidadCarga);
        vehiculo.setNumeroEjes(numeroEjes);
        return vehiculo;
    }

    public static VehiculoPasajeros crearVehiculoPasajeros(String placa, String modelo, String marca,
                                                           String color, Propietario propietario,
                                                           int numeroMaximoPasajeros) {
        VehiculoPasajeros vehiculo = new VehiculoPasajeros();
        vehiculo.setPlaca(placa);
        vehiculo.setModelo(modelo);
        vehiculo.setMarca(marca);
        vehiculo.setColor(color);
        vehiculo.setPropietario(propietario);
        vehiculo.setNumeroMaximoPasajeros(numeroMaximoPasajeros);
        return vehiculo;
    }
}
