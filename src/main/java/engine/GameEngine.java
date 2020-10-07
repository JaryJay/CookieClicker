package engine;

import bundle.GameBundleWrapper;
import bundle.visuals.displayer.renderer.GameRenderer;

/**
 * A basic engine interface. Has a init() function, startEngine() function, and
 * attach() function.
 * <p>
 * init() initializes the game engine. Everything in here would run once at the
 * beginning.
 * <p>
 * startEngine() is similar to the init(), but it would start everything
 * running.
 * <p>
 * attach() attaches the provided bundle wrapper to the game engine.
 * 
 * @author Jay
 *
 */
public interface GameEngine {

//	@SuppressWarnings("rawtypes")
//	public abstract void startGame(GameBundleWrapper wrapper);
//
	public abstract GameBundleWrapper getWrapper();

	public abstract void init();

	public abstract void startEngine();

	public abstract void attach(GameBundleWrapper wrapper);

	public abstract GameRenderer getRenderer();

}
