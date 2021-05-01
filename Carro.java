package models;

public class Carro extends Vehiculo {

	private int puertas;
	public static String tipo = "Carro";

	protected Carro(ColorEnum color, String ref, int velocidadMaxima, int puertas) {
        this.color = color;
		this.ref = ref;
		this.velocidadMaxima = velocidadMaxima;
		this.puertas = puertas;
	}

	public String getRef() {
		return ref;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public int getPuertas() {
		return puertas;
	}

	@Override
	public String toString() {
		return tipo + "\n Color: " + getColor().name() + " | Referencia: " + getRef() + " | Velocidad Maxima "
				+ getVelocidadMaxima() + " km/h |  Numero de puertas: " + getPuertas();
	}
}

// Constructor especifico para el carro
class BuilderCarro extends BuilderVehiculo {
    private int numPuertas;

    public BuilderCarro() {}

    public BuilderCarro numeroPuertas(int alt) {
        this.numPuertas = alt;
        return this;
    }

    public Vehiculo build() {
        return new Avion(this.color, this.ref, this.velocidadMaxima, this.numPuertas);
    }
}