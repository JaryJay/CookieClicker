package bundle.visuals.displayer.specifics;

import bundle.visuals.displayer.Displayer;
import bundle.visuals.displayer.renderer.GameRenderer;

public class RectangleDisplayer implements Displayer{

	private GameRenderer renderer;

	public RectangleDisplayer(GameRenderer renderer) {
		super();
		this.renderer = renderer;
	}
	
	@Override
	public void display() {
		renderer.fill(48, 199, 18);
		renderer.drawRectangle(60, 140, 200, 350);
	}

}
