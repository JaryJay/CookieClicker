package bundle.visuals.displayer.renderer.specifics;

import bundle.visuals.displayer.renderer.GameRenderer;
import engine.specifics.ProcessingSketch;

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
	public void fill(int r, int g, int b) {
		sketch.fill(r, g, b);
	}

}
