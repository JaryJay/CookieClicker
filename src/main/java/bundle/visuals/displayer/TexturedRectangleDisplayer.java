package bundle.visuals.displayer;

import bundle.visuals.displayable.TexturedRectangle;
import bundle.visuals.renderer.GameRenderer;

public class TexturedRectangleDisplayer extends Displayer<TexturedRectangle> {

	public TexturedRectangleDisplayer(GameRenderer renderer) {
		super(renderer);
	}

	@Override
	public void display(TexturedRectangle displayable) {
		renderer.fill(48, 199, 18);
		renderer.drawRectangle(60, 140, 200, 350);
	}

}
