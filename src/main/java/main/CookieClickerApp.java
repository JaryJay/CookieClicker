package main;

import bundle.GameBundleWrapper;
import bundle.specifics.cookieclicker.CookieClickerGameBundleWrapper;
import bundle.visuals.displayer.renderer.GameRenderer;
import engine.GameEngine;
import engine.specifics.ProcessingSketch;

/**
 * 
 * Let's experiment with some general game design stuff with a simple game of
 * cookie clicker :)
 * 
 * @author Jay, Donny
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
		// Create an engine.
		// We use ProcessingSketch in Cookie Clicker.
		// To use a different engine, assign to engine an object of a different
		// class that implements GameEngine.
		GameEngine engine = new ProcessingSketch();

		// Create a renderer.
		// We use Processing's built-in renderer.
		// To change, assign to renderer an object of a different class that implements
		// GameRenderer.
		GameRenderer renderer = engine.getRenderer();

		// Create a bundle wrapper that holds a bundle. In this case, we use a
		// CookieClickerGameBundleWrapper.
		// To change, change CookieClickerGameBundleWrapper to the bundle wrapper
		// of your choice, e.g. DoNothingGameBundleWrapper()
		GameBundleWrapper bundleWrapper = new CookieClickerGameBundleWrapper();

		// Attach the bundleWrapper to the engine.
		// Don't change.
		engine.attach(bundleWrapper);

		// Create and run the game enabler.
		// Don't change.
		GameEnabler enabler = new GameEnabler(engine, renderer, bundleWrapper);
		enabler.enable();
	}

}
