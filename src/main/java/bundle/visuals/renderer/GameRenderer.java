package bundle.visuals.renderer;

import processing.core.PImage;

public interface GameRenderer {

	public void drawRectangle(int topLeftX, int topLeftY, int width, int height);

	public void drawTexturedRectangle(int topLeftX, int topLeftY, int width, int height);

	public void drawEllipse(int topLeftX, int topLeftY, int width, int height);

	public void drawTexturedEllipse(int topLeftX, int topLeftY, int width, int height);

	public void drawImage(PImage image, int topLeftX, int topLeftY, int width, int height);

	public void fill(int r, int g, int b);

	public void outlineColour(int r, int g, int b);

	public void textSize(int size);

	public void text(String text, int topLeftX, int topLeftY);

	public void clear(int r, int g, int b);

}
