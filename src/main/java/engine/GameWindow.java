package engine;

import bundle.GameBundleWrapper;

/**
 * A basic engine interface. Has a init() function, startEngine() function,
 * getWrapper() function, and setBundleWrapper() function.
 * <p>
 * init() initializes the game engine. Everything in here would run once at the
 * beginning.
 * <p>
 * startEngine() is similar to the init(), but it would start everything
 * running.
 * <p>
 * getWrapper() returns the attached bundle wrapper.
 * <p>
 * setBundleWrapper() attaches the provided bundle wrapper to the game engine.
 * 
 * @author Jay
 *
 */
public interface GameWindow {

	public default void init() {
	}

	public abstract void startEngine();

	public abstract GameBundleWrapper getWrapper();

	public abstract void setBundleWrapper(GameBundleWrapper wrapper);

	public abstract void setWindowTitle(String windowTitle);

	public abstract String getWindowTitle();

}
