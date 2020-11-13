package specifics.main;

import bundle.GameBundleWrapper;
import bundle.input.inputdecorator.GameInputDecorator;
import bundle.visuals.renderer.AbstractGameRenderer;
import engine.GameEnabler;
import engine.ProcessingSketch;
import specifics.bundle.CookieClickerGameBundleWrapper;

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
		// Create an window.
		// We use ProcessingSketch in Cookie Clicker.
		// To use a different window, assign to engine an instance of a different
		// class that implements GameWindow.
		ProcessingSketch window = new ProcessingSketch();

		// Get a renderer from the window.
		// Don't change.
		AbstractGameRenderer renderer = window.getRenderer();

		// Get an input decorator from the window.
		// Don't change.
		GameInputDecorator inputDecorator = window.getInputDecorator();

		// Create a bundle wrapper that holds a bundle. In this case, we use a
		// CookieClickerGameBundleWrapper.
		// To change, change CookieClickerGameBundleWrapper to the bundle wrapper
		// of your choice, e.g. NomadsGameBundleWrapper()
		GameBundleWrapper bundleWrapper = new CookieClickerGameBundleWrapper();

		// Create and run the game enabler.
		// Don't change.
		GameEnabler enabler = new GameEnabler(window, renderer, inputDecorator, bundleWrapper, "Cookie Clicker");
		enabler.enable();
	}

}
