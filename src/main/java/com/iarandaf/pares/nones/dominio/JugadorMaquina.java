package com.iarandaf.pares.nones.dominio;

public class JugadorMaquina extends Jugador {
	
	@Override
	public int getNumeroElegido() {
		return this.numeroElegido;
	}

	@Override
	public void setNumeroElegido(int numeroElegido) {
		this.numeroElegido=numeroElegido;
	}
}

	
