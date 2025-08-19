package programacion.model;

public class VehiculoPasajeros extends Vehiculo{
    private int numeroMaximoPasajeros;

    public VehiculoPasajeros() {
        super();
    }

    public int getNumeroMaximoPasajeros() {
        return numeroMaximoPasajeros;
    }
    public void setNumeroMaximoPasajeros(int numeroMaximoPasajeros) {
        this.numeroMaximoPasajeros = numeroMaximoPasajeros;
    }

    @Override
    public String getTipoVehiculo() {
        return "Vehiculo de Pasajeros";
    }

    @Override
    public String toString() {
        return "VehiculoPasajeros{" +
                "numeroMaximoPasajeros=" + numeroMaximoPasajeros +
                '}';
    }
}
