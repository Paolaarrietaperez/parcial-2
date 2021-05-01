package models;

public class Yate extends Vehiculo {

	private int pesoMaximo;
	private static String tipo = "Yate";

	protected Yate(ColorEnum color, String ref, int velocidadMaxima, int pesoMaximo) {
        this.color = color;
		this.ref = ref;
		this.velocidadMaxima = velocidadMaxima;
		this.pesoMaximo = pesoMaximo;
	}

	public String getRef() {
		return ref;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public int getPesoMaximo() {
		return pesoMaximo;
	}

	@Override
	public String toString() {
		return tipo + "\n Color: " + getColor().name() + " | Referencia: " + getRef() + " | Velocidad Maxima "
				+ getVelocidadMaxima() + " km/h |  Peso maximo: " + getPesoMaximo() + " kg";
	}
}

// Constructor especifico para el yate
class BuilderYate extends BuilderVehiculo {
    private int pesoMaximo;

    public BuilderYate() {}

    public BuilderYate pesoMaximo(int alt) {
        this.pesoMaximo = alt;
        return this;
    }

    public Vehiculo build() {
        return new Avion(this.color, this.ref, this.velocidadMaxima, this.pesoMaximo);
    }
}