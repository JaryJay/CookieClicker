package bundle.visuals.renderer;

import bundle.visuals.texture.AbstractTexture;
import bundle.visuals.texture.ProcessingTexture;
import engine.ProcessingSketch;

public class ProcessingRenderer implements GameRenderer {

	private ProcessingSketch sketch;

	public ProcessingRenderer(ProcessingSketch sketch) {
		this.sketch = sketch;
	}

	@Override
	public void drawLine(float x1, float y1, float x2, float y2) {
		sketch.line(x1, y1, x2, y2);
	}

	@Override
	public void drawRectangle(float topLeftX, float topLeftY, float width, float height) {
		sketch.rect(topLeftX, topLeftY, width, height);
	}

	@Override
	public void drawTexturedRectangle(float topLeftX, float topLeftY, float width, float height) {
		sketch.rect(topLeftX, topLeftY, width, height);
	}

	@Override
	public void drawEllipse(float topLeftX, float topLeftY, float width, float height) {
		sketch.ellipse(topLeftX, topLeftY, width, height);
	}

	@Override
	public void drawTexturedEllipse(float topLeftX, float topLeftY, float width, float height) {
		sketch.ellipse(topLeftX, topLeftY, width, height);
	}

	@Override
	public void drawTexture(AbstractTexture texture, float topLeftX, float topLeftY, float width, float height) {
		sketch.image(((ProcessingTexture) texture).getImage(), topLeftX, topLeftY, width, height);
	}

	@Override
	public void fill(float r, float g, float b) {
		sketch.fill(r, g, b);
	}

	@Override
	public void outlineColour(float r, float g, float b) {
		sketch.stroke(r, g, b);
	}

	@Override
	public void textSize(float size) {
		sketch.textSize(size);
	}

	@Override
	public void text(String text, float topLeftX, float topLeftY) {
		sketch.text(text, topLeftX, topLeftY);
	}

	@Override
	public void clear(float r, float g, float b) {
		sketch.background(r, g, b);
	}

}
