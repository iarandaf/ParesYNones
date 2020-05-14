package com.iarandaf.pares.nones.dominio;

public class JugadorHumano extends Jugador {
	private String nombre;

	@Override
	public int getNumeroElegido() {
		return this.numeroElegido;
	}

	@Override
	public void setNumeroElegido(int numeroElegido) {
		this.numeroElegido=numeroElegido;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
}
