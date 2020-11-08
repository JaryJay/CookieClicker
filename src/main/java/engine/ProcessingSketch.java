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
public class ProcessingSketch extends PApplet implements GameWindow {

	private GameBundleWrapper wrapper;
	private GameRenderer gameRenderer;
	private GameInputDecorator inputDecorator;

	private String windowTitle;
	private final boolean FULLSCREEN = false;
	private final boolean RESIZABLE = true;

	public ProcessingSketch() {
		gameRenderer = new ProcessingRenderer(this);
		inputDecorator = new ProcessingInputDecorator();
	}

	@Override
	public void startEngine() {
		String[] processingArgs = { this.getClass().getName() };
		PApplet.runSketch(processingArgs, this);
	}

	/**
	 * Runs once before the processing window is opened. If something is throwing an
	 * error in here, try moving it to setup().
	 */
	@Override
	public void settings() {
		if (FULLSCREEN) {
			fullScreen();
			size(displayWidth, displayHeight, P2D);
		} else {
			size(1600, 900, P2D);
		}
	}

	@Override
	public void setup() {
		surface.setTitle(windowTitle);
		if (RESIZABLE) {
			surface.setResizable(true);
		}
		textAlign(CENTER, CENTER);
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

	/**
	 * Does something when the mouse is moved and a mouse button is not pressed.
	 */
	@Override
	public void mouseMoved() {
		inputDecorator.decorateMouseMoved(mouseX, mouseY);
	}

	@Override
	public void mousePressed() {
		inputDecorator.decorateMousePressed(mouseButton, mouseX, mouseY);
	}

	@Override
	public void mouseReleased() {
		inputDecorator.decorateMouseReleased(mouseButton, mouseX, mouseY);
	}

	/**
	 * Does something when the mouse is moved and a mouse button is pressed.
	 * However, for more intuitive design, we decorate this as a mouse moved event.
	 */
	@Override
	public void mouseDragged() {
		inputDecorator.decorateMouseMoved(mouseX, mouseY);
	}

	@Override
	public void mouseWheel(MouseEvent event) {
		inputDecorator.decorateMouseScrolled(event.getCount());
	}

	@Override
	public String getWindowTitle() {
		return windowTitle;
	}

	@Override
	public void setWindowTitle(String windowTitle) {
		this.windowTitle = windowTitle;
	}

}
