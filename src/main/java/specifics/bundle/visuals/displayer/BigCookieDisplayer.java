package specifics.bundle.visuals.displayer;

import bundle.visuals.displayer.Displayer;
import bundle.visuals.renderer.GameRenderer;
import specifics.bundle.visuals.displayable.BigCookie;

public class BigCookieDisplayer extends Displayer<BigCookie> {

	public BigCookieDisplayer(GameRenderer renderer) {
		super(renderer);
	}

	@Override
	public void display(BigCookie displayable) {
		renderer.fill(82, 53, 17);
		int radius = (int) displayable.getRadius();
		renderer.drawEllipse((int) displayable.getCenterX(), (int) displayable.getCenterY(), radius, radius);
	}

}
