package nttdata.javat1;

import nttdata.javat1.game.Game;

public class T1Mainernestocf {
	/**
	 * main: llama al launchAndStart usando el objeto main
	 * 
	 * @author Ernesto Caballero
	 * @param args
	 */
	public static void main(String[] args) {
		Game pinball = new Game();
		pinball.launchAndStart();
	}
}
