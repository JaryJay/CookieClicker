package engine;

import bundle.GameBundleWrapper;
import bundle.input.inputdecorator.GameInputDecorator;
import bundle.logic.GameLogicTimer;
import bundle.visuals.renderer.GameRenderer;

/**
 * A game kickstarter. Initializes everything required to start a game, and puts
 * everything in motion.
 * 
 * The enable() function should be called to do this.
 * 
 * @author Jay
 *
 */
public class GameEnabler {

	private GameEngine engine;
	private GameRenderer renderer;
	private GameInputDecorator inputDecorator;
	private GameBundleWrapper wrapper;

	/**
	 * The constructor takes in and saves an engine, a renderer, an input buffer,
	 * and a game wrapper.
	 * 
	 * @param engine
	 * @param renderer
	 * @param inputDecorator
	 * @param wrapper
	 */
	public GameEnabler(GameEngine engine, GameRenderer renderer, GameInputDecorator inputDecorator,
			GameBundleWrapper wrapper) {
		this.engine = engine;
		this.renderer = renderer;
		this.inputDecorator = inputDecorator;
		this.wrapper = wrapper;
	}

	/**
	 * Initializes everything required to start a game, and puts everything in
	 * motion.
	 */
	public void enable() {
		// Attach the bundleWrapper to the engine.
		// Don't change.
		engine.setBundleWrapper(wrapper);
		engine.startEngine();
		wrapper.setRenderer(renderer);
		inputDecorator.setGameInputBuffer(wrapper.getInputBuffer());
		inputDecorator.setBundleWrapper(wrapper);
		wrapper.getBundle().initBundleParts();
		GameLogicTimer timer = new GameLogicTimer(wrapper);
		Thread gameLogicThread = new Thread(timer);
		gameLogicThread.start();
	}

}
