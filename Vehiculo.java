package models;

// Este archivo contiene las clases e interfaces que definen los vehiculos y sus respectivos contructores especificos

public abstract class Vehiculo {
	protected ColorEnum color;
	protected String ref;
	protected int velocidadMaxima;

	public Vehiculo() {}

	public ColorEnum getColor() {
		return color;
	}

	public abstract String getRef();

	public abstract int getVelocidadMaxima();

	@Override
	public String toString() {
		return super.toString();
	}
}

// Implentacion de patron ABSTRACT FACTORY
interface BuilderBase {
    Vehiculo colorVehiculo();
    Vehiculo refVehiculo();
    Vehiculo velMaxVehiculo();
}

// Modelo basico de constructor de vehiculos
// Implentacion de patron BUILDER
abstract class BuilderVehiculo {
	protected ColorEnum color;
	protected String ref;
    protected int velocidadMaxima;

    public BuilderVehiculo colorVehiculo(ColorEnum c) {
        this.color = c;
        return this;
    }

    public BuilderVehiculo refVehiculo(String r) {
        this.ref = r;
        return this;
    }

    public BuilderVehiculo velMaxVehiculo(int v) {
        this.velocidadMaxima = v;
        return this;
    }
}