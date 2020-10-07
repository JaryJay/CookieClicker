package main;

import bundle.GameBundleWrapper;
import bundle.specifics.cookieclicker.CookieClickerGameBundleWrapper;
import engine.GameEngine;
import engine.specifics.ProcessingSketch;

/**
 * 
 * Let's experiment with some general game design stuff with a simple game of
 * cookie clicker :)
 * 
 * @author Jary, Donny
 *
 */
public class CookieClickerApp {

	/**
	 * A main function that runs at the start of the game.
	 * 
	 * We create a game engine and a bundle wrapper class to send to a game enabler.
	 * The game enabler then kickstarts the game.
	 * 
	 * @param args
	 * @author Jay
	 */
	public static void main(String[] args) {
		// Create a renderer.
		// We use ProcessingSketch in Cookie Clicker.
		// To use a different renderer, assign to renderer an object of a different
		// class that implements GameRenderer.
		GameEngine engine = new ProcessingSketch();

		// Create a bundle wrapper that holds a bundle. In this case, we use a
		// CookieClickerGameBundleWrapper.
		// To change, change CookieClickerGameBundleWrapper to the bundle wrapper
		// of your choice, e.g. DoNothingGameBundleWrapper()
		GameBundleWrapper bundleWrapper = new CookieClickerGameBundleWrapper();

		engine.attach(bundleWrapper);
		// Create and run the game enabler.
		// Don't change.
		GameEnabler enabler = new GameEnabler(engine, null, bundleWrapper);
		enabler.enable();
	}

}
