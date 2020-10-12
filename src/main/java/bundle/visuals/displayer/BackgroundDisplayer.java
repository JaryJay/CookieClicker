package bundle.visuals.displayer;

import bundle.visuals.displayable.Background;
import bundle.visuals.renderer.GameRenderer;

public class BackgroundDisplayer extends Displayer<Background> {

	public BackgroundDisplayer(GameRenderer renderer) {
		super(renderer);
	}

	@Override
	public void display(Background displayable) {
		renderer.clear(displayable.getR(), displayable.getG(), displayable.getB());
	}

}
