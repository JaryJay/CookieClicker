package bundle.visuals.displayer;

import bundle.visuals.displayable.Background;
import bundle.visuals.renderer.AbstractGameRenderer;

public class BackgroundDisplayer extends AbstractDisplayer<Background> {

	public BackgroundDisplayer(AbstractGameRenderer renderer) {
		super(renderer);
	}

	@Override
	public void display(Background displayable) {
		renderer.clear(displayable.getR(), displayable.getG(), displayable.getB());
	}

}
