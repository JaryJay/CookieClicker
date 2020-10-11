package bundle.visuals.displayer.specifics;

import bundle.visuals.displayable.specifics.BigCookie;
import bundle.visuals.displayer.Displayer;
import bundle.visuals.renderer.GameRenderer;

public class BigCookieDisplayer extends Displayer<BigCookie> {

	public BigCookieDisplayer(BigCookie displayable, GameRenderer renderer) throws Exception {
		super(displayable, renderer);
	}

	@Override
	public void display() {
		renderer.fill(82, 53, 17);
		renderer.drawEllipse(180, 300, 200, 200);
	}

}
