package engine;

import bundle.GameBundle;
import bundle.GameBundleWrapper;
import bundle.visuals.renderer.GameRenderer;
import bundle.visuals.renderer.ProcessingRenderer;
import processing.core.PApplet;

/**
 * Processing P5 supplied library. Handles both visuals and input.
 * 
 * @author Jay
 *
 */
public class ProcessingSketch extends PApplet implements GameEngine {

	private GameBundleWrapper wrapper;
	private boolean fullScreen = false;

	@Override
	public void startEngine() {
		String[] processingArgs = { this.getClass().getName() };
		PApplet.runSketch(processingArgs, this);
	}

	@Override
	public void settings() {
		if (fullScreen) {
			fullScreen();
			size(displayWidth, displayHeight, P2D);
		} else {
			size(800, 600, P2D);
		}
	}

	@Override
	public void setup() {
	}

	/**
	 * A function that runs once every frame.
	 */
	@Override
	public void draw() {
		GameBundle bundle = wrapper.getBundle();
		bundle.getVisuals().display();
	}

	@Override
	public void setBundleWrapper(GameBundleWrapper wrapper) {
		this.wrapper = wrapper;
	}

	@Override
	public GameBundleWrapper getWrapper() {
		return wrapper;
	}

	public GameRenderer getRenderer() {
		return new ProcessingRenderer(this);
	}

	@Override
	public void init() {
	}

}
