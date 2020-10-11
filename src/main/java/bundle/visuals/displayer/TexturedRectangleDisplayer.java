package bundle.visuals.displayer;

import bundle.visuals.displayable.TexturedRectangle;
import bundle.visuals.renderer.GameRenderer;

public class TexturedRectangleDisplayer extends Displayer<TexturedRectangle> {

	public TexturedRectangleDisplayer(TexturedRectangle displayable, GameRenderer renderer) {
		super(displayable, renderer);
	}

	@Override
	public void display() {
		renderer.fill(48, 199, 18);
		renderer.drawRectangle(60, 140, 200, 350);
	}

}
