package engine.specifics;

import bundle.GameBundle;
import bundle.GameBundleWrapper;
import engine.GameEngine;
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

	public ProcessingSketch() {
	}

	@Override
	public void init() {
	}

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
		bundle.getVisuals().draw();
	}

	@Override
	public void attach(GameBundleWrapper wrapper) {
		this.wrapper = wrapper;
	}

	@Override
	public GameBundleWrapper getWrapper() {
		return wrapper;
	}

}
