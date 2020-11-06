package bundle.visuals.renderer;

import engine.ProcessingSketch;
import processing.core.PImage;

public class ProcessingRenderer implements GameRenderer {

	private ProcessingSketch sketch;

	public ProcessingRenderer(ProcessingSketch sketch) {
		this.sketch = sketch;
	}

	@Override
	public void drawRectangle(int topLeftX, int topLeftY, int width, int height) {
		sketch.rect(topLeftX, topLeftY, width, height);
	}

	@Override
	public void drawTexturedRectangle(int topLeftX, int topLeftY, int width, int height) {
		sketch.rect(topLeftX, topLeftY, width, height);
	}

	@Override
	public void drawEllipse(int topLeftX, int topLeftY, int width, int height) {
		sketch.ellipse(topLeftX, topLeftY, width, height);
	}

	@Override
	public void drawTexturedEllipse(int topLeftX, int topLeftY, int width, int height) {
		sketch.ellipse(topLeftX, topLeftY, width, height);
	}

	@Override
	public void drawImage(PImage image, int topLeftX, int topLeftY, int width, int height) {
		sketch.image(image, topLeftX, topLeftY, width, height);
	}

	@Override
	public void fill(int r, int g, int b) {
		sketch.fill(r, g, b);
	}

	@Override
	public void outlineColour(int r, int g, int b) {
		sketch.stroke(r, g, b);
	}

	@Override
	public void textSize(int size) {
		sketch.textSize(size);
	}

	@Override
	public void text(String text, int topLeftX, int topLeftY) {
		sketch.text(text, topLeftX, topLeftY);
	}

	@Override
	public void clear(int r, int g, int b) {
		sketch.background(r, g, b);
	}

}
