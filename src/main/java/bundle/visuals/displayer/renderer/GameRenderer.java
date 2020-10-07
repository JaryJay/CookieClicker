package bundle.visuals.displayer.renderer;

public interface GameRenderer {

	public void drawRectangle(int topLeftX, int topLeftY, int width, int height);

	public void drawTexturedRectangle(int topLeftX, int topLeftY, int width, int height);
	
	public void drawEllipse(int topLeftX, int topLeftY, int width, int height);
	
	public void drawTexturedEllipse(int topLeftX, int topLeftY, int width, int height);
	
	public void fill(int r, int g, int b);

}
