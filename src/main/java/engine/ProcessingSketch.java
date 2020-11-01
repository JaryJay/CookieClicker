package engine;

import bundle.GameBundle;
import bundle.GameBundleWrapper;
import bundle.input.inputdecorator.GameInputDecorator;
import bundle.input.inputdecorator.ProcessingInputDecorator;
import bundle.visuals.renderer.GameRenderer;
import bundle.visuals.renderer.ProcessingRenderer;
import processing.core.PApplet;
import processing.event.MouseEvent;

/**
 * Processing P5 supplied library. Handles both visuals and input.
 * 
 * @author Jay
 *
 */
public class ProcessingSketch extends PApplet implements GameEngine {

	private GameBundleWrapper wrapper;
	private GameRenderer gameRenderer;
	private GameInputDecorator inputDecorator;
	private boolean fullScreen = false;

	public ProcessingSketch() {
		gameRenderer = new ProcessingRenderer(this);
		inputDecorator = new ProcessingInputDecorator();
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
		bundle.getVisuals().display();
		bundle.getInput().handleAll();
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
		return gameRenderer;
	}

	public GameInputDecorator getInputDecorator() {
		return inputDecorator;
	}

	@Override
	public void keyPressed() {
		inputDecorator.decorateKeyPressed(keyCode);
	}

	@Override
	public void keyReleased() {
		inputDecorator.decorateKeyReleased(keyCode);
	}

	@Override
	public void mouseMoved() {
		inputDecorator.decorateMouseMoved(mouseX, mouseY);
	}

	@Override
	public void mousePressed() {
		inputDecorator.decorateMousePressed(mouseButton);
	}

	@Override
	public void mouseReleased() {
		inputDecorator.decorateMouseReleased(mouseButton);
	}

	@Override
	public void mouseWheel(MouseEvent event) {
		inputDecorator.decorateMouseScrolled(event.getCount());
	}

}
