package com.iarandaf.pares.nones;

import com.iarandaf.pares.nones.dominio.JugadorHumano;
import com.iarandaf.pares.nones.dominio.JugadorMaquina;
import com.iarandaf.pares.nones.service.JuegoService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JugadorHumano jugadorH = new JugadorHumano();
		JugadorMaquina jugadorM = new JugadorMaquina();
		JuegoService juego = new JuegoService();

		juego.EmpezarJuego(jugadorM, jugadorH);
		jugadorH.setNombre("Ignacio");
	}

}
