package com.iarandaf.pares.nones.service;

import java.util.Scanner;

/**
 * Se encarga de las creaciones del Menú
 * 
 * @author iarandaf
 *
 */

public class MenuService {

	public String mostrarMenu() {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Elije Pares o Nones. (Para finalizar pulse -1) ");
		return teclado.next().toLowerCase();
	}
}
