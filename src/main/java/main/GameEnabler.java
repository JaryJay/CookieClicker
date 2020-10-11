package main;

import bundle.GameBundleWrapper;
import bundle.logic.GameLogicTimer;
import bundle.visuals.renderer.GameRenderer;
import engine.GameEngine;

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
	private GameBundleWrapper wrapper;

	/**
	 * The constructor takes in and saves an engine, a renderer, and a game wrapper.
	 * 
	 * @param engine
	 * @param renderer
	 * @param wrapper
	 */
	public GameEnabler(GameEngine engine, GameRenderer renderer, GameBundleWrapper wrapper) {
		this.engine = engine;
		this.renderer = renderer;
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
		wrapper.getBundle().initBundleParts(renderer);
		GameLogicTimer timer = new GameLogicTimer(wrapper);
		Thread gameLogicThread = new Thread(timer);
		gameLogicThread.start();
	}

}
