package com.iarandaf.pares.nones.service;

import java.util.Scanner;

import com.iarandaf.pares.nones.dominio.JugadorHumano;
import com.iarandaf.pares.nones.dominio.JugadorMaquina;

/**
 * Se encarga de la lógica del juego
 * 
 * @author iarandaf
 *
 */

public class JuegoService {

	private MenuService menuService;
	private Scanner teclado1;

	public JuegoService() {
		menuService = new MenuService();
		teclado1 = new Scanner(System.in);
	}

	public void EmpezarJuego(JugadorMaquina jugadorMaquina, JugadorHumano jugadorHumano) {
		String opcion = "";
		int contUsuario = 0;
		int contMaquina = 0;
		int numUsuario;
		int numMaquina;
		int suma;
		opcion = menuService.mostrarMenu();

		do {

			numUsuario = leerNumUsuario();
			jugadorHumano.setNumeroElegido(numUsuario);

			numMaquina = generarNumMaquina();
			jugadorMaquina.setNumeroElegido(numMaquina);

			suma = jugadorHumano.getNumeroElegido() + jugadorMaquina.getNumeroElegido();

			if (opcion.equals("pares") && (suma % 2 == 0)) {
				System.out.println("Has ganado!!");
				contUsuario++;
			} else if (opcion.equals("nones") && (suma % 2 != 0)) {
				System.out.println("Has ganado!!");
				contUsuario++;
			} else {
				System.out.println("Has perdido!!");
				contMaquina++;
			}
			System.out.printf("Marcador: Jugador: %d | Maquina: %d \n", contUsuario, contMaquina);
			opcion = menuService.mostrarMenu();
		} while (!opcion.equals("-1"));
	}

	private int leerNumUsuario() {
		System.out.println("Introduce el numero elegido: ");
		return teclado1.nextInt();
	}

	/**
	 * Este método genera un número aleatorio del 1 al 5
	 * 
	 * @return devuelve un número del 1 al 5
	 */
	private int generarNumMaquina() {
		int numMaquina;
		return (int) Math.floor(Math.random() * 5 + 1);
	}

}
