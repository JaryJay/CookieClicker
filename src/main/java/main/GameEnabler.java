package main;

import bundle.GameBundleWrapper;
import bundle.logic.GameLogicTimer;
import bundle.visuals.displayer.renderer.GameRenderer;
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

	GameEngine engine;
	GameRenderer renderer;
	GameBundleWrapper wrapper;

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
		engine.startEngine();
		GameLogicTimer timer = new GameLogicTimer(wrapper.getBundle().getLogic());
		Thread gameLogicThread = new Thread(timer);
		gameLogicThread.start();
	}

}
