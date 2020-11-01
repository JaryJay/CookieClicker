package specifics.main;

import bundle.GameBundleWrapper;
import bundle.input.inputdecorator.GameInputDecorator;
import bundle.visuals.renderer.GameRenderer;
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
		// Create an engine.
		// We use ProcessingSketch in Cookie Clicker.
		// To use a different engine, assign to engine an instance of a different
		// class that implements GameEngine.
		ProcessingSketch engine = new ProcessingSketch();

		// Get a renderer from the engine.
		// Don't change.
		GameRenderer renderer = engine.getRenderer();

		// Get an input decorator from the engine.
		// Don't change.
		GameInputDecorator inputDecorator = engine.getInputDecorator();

		// Create a bundle wrapper that holds a bundle. In this case, we use a
		// CookieClickerGameBundleWrapper.
		// To change, change CookieClickerGameBundleWrapper to the bundle wrapper
		// of your choice, e.g. NomadsGameBundleWrapper()
		GameBundleWrapper bundleWrapper = new CookieClickerGameBundleWrapper();

		// Create and run the game enabler.
		// Don't change.
		GameEnabler enabler = new GameEnabler(engine, renderer, inputDecorator, bundleWrapper);
		enabler.enable();
	}

}
