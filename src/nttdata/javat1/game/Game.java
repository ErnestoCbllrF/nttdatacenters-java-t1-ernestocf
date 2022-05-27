package nttdata.javat1.game;

import java.util.Scanner;

public class Game {
	Scanner scan = new Scanner(System.in);

	public void launchAndStart() {
		/* Inicialización de variables de la función */
		int coins = 0;
		int lifes = 0;
		int totalScore = 0;
		/*
		 * Bucle para validar que el numero de monedas este en el rango valido para
		 * entrar en el switch
		 */
		do {
			System.out.println("Introduce número de monedas");
			coins = scan.nextInt();
		} while (coins < 1 || coins > 4);

		switch (coins) {
		case 1:
			lifes = 1;
			break;
		case 2:
			lifes = 3;
			break;
		case 3:
			lifes = 7;
			break;
		default:
			lifes = 10;
			break;
		}

		/*
		 * Se declara direction con el scan para que entre en el do while de los
		 * movimientos posibles y que no vaya directamente al final del código del bucle
		 */
		System.out.println("Iniciando");
		String direction = scan.nextLine();
		for (int i = lifes; i > 0; i--) {
			/* Reseteo de la puntuación de la pelota en cada vida */
			launchBall();
			System.out.println("Número de vidas: " + i);
			boolean salir = false;
			do {
				System.out.println("Introduce tecla para mover las palas");
				direction = scan.nextLine();
				/* if-else de los movimientos posibles */
				if (direction.charAt(0) == 'a') {
					Ball.Score += (int) (Math.random() * 501);
				} else if (direction.charAt(0) == 'd') {
					Ball.Score += (int) (Math.random() * 401);
				} else {
					System.out.println("Ha perdido una vida");
					salir = true;
				}
			} while (direction.length() == 1 && !salir);
			/*
			 * Sumatorio de la puntuación obtenido durante esa vida antes del reseteo con la
			 * nueva bola
			 */
			totalScore += Ball.Score;

		}

		System.out.println("Has obtenido una puntuación de " + totalScore);

	}

	/**
	 * Función launchBall: resetea la puntuación de la bola
	 */
	public void launchBall() {
		Ball.Score = 0;
	}
}
