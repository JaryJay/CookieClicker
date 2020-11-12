package bundle.visuals.renderer;

import bundle.visuals.texture.AbstractTexture;
import common.coordinates.PixelCoordinates;

public interface GameRenderer {

	public void drawLine(float x1, float y1, float x2, float y2);

	public void drawRectangle(float f, float g, float h, float i);

	public void drawTexturedRectangle(float x, float y, float width, float height);

	public void drawEllipse(float x, float y, float width, float height);

	public void drawTexturedEllipse(float x, float y, float width, float height);

	public default void drawCircle(float x, float y, float radius) {
		drawEllipse(x, y, radius * 2, radius * 2);
	}

	public default void drawImage(AbstractTexture texture, float x, float y) {
		PixelCoordinates defaultDimensions = texture.getDefaultDimensions();
		drawTexture(texture, x, y, defaultDimensions.x, defaultDimensions.y);
	}

	public void drawTexture(AbstractTexture texture, float x, float y, float width, float height);

	public default void fill(float grey) {
		fill(grey, grey, grey);
	}

	public void fill(float r, float g, float b);

	public void outlineColour(float r, float g, float b);

	public void clear(float r, float g, float b);

	public void textSize(float size);

	public void text(String text, float x, float y);

}
