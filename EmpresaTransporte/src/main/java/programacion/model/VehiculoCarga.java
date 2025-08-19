package programacion.model;

public class VehiculoCarga extends Vehiculo{
    private double capacidadCarga;
    private int numeroEjes;

    public VehiculoCarga(){
        super();
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }
    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    @Override
    public String getTipoVehiculo() {
        return "Vehículo de Carga";
    }

    @Override
    public String toString() {
        return "VehiculoCarga{" +
                "capacidadCarga=" + capacidadCarga +
                ", numeroEjes=" + numeroEjes +
                '}';
    }
}
