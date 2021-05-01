package models;

public class Avion extends Vehiculo {

	private int altitudMaxima;
	private static String tipo = "Avion";

	protected Avion(ColorEnum color, String ref, int velocidadMaxima, int altitudMaxima) {
        this.color = color;
		this.ref = ref;
		this.velocidadMaxima = velocidadMaxima;
		this.altitudMaxima = altitudMaxima;
	}

	public String getRef() {
		return ref;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public int getAltitudMaxima() {
		return altitudMaxima;
	}

	@Override
	public String toString() {
		return tipo + "\n Color: " + getColor().name() + " | Referencia: " + getRef() + " | Velocidad Maxima "
				+ getVelocidadMaxima() + "km/h |  Altitud maxima: " + getAltitudMaxima() + " m";
	}
}

// Constructor especifico para el avion
class BuilderAvion extends BuilderVehiculo {
    private int altitudMaxima;

    public BuilderAvion() {}

    public BuilderAvion altitudVehiculo(int alt) {
        this.altitudMaxima = alt;
        return this;
    }

    public Vehiculo build() {
        return new Avion(this.color, this.ref, this.velocidadMaxima, this.altitudMaxima);
    }
}

/*
class BuilderAvion implements BuilderVehiculo {
    public Vehiculo color(ColorEnum c) {
        this.color = c;
        return this;
    }

    public Vehiculo referencia(String r) {
        this.ref = r;
        return this;
    }

    public Vehiculo velocidadMaxima(int v) {
        this.velocidadMaxima = v;
        return this;
    }

    public Vehiculo build() {
        return new Avi();
    }
}*/