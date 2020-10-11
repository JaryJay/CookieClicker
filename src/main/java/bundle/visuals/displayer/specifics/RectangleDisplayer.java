package bundle.visuals.displayer.specifics;

import bundle.visuals.displayable.TexturedRectangle;
import bundle.visuals.displayer.Displayer;
import bundle.visuals.renderer.GameRenderer;

public class RectangleDisplayer extends Displayer<TexturedRectangle> {

	public RectangleDisplayer(TexturedRectangle displayable, GameRenderer renderer) {
		super(displayable, renderer);
	}

	@Override
	public void display() {
		renderer.fill(48, 199, 18);
		renderer.drawRectangle(60, 140, 200, 350);
	}

}
