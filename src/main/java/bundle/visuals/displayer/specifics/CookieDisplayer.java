package bundle.visuals.displayer.specifics;

import bundle.visuals.displayer.Displayer;
import bundle.visuals.displayer.renderer.GameRenderer;

public class CookieDisplayer implements Displayer {

	private GameRenderer renderer;

	public CookieDisplayer(GameRenderer renderer) {
		super();
		this.renderer = renderer;
	}

	@Override
	public void display() {
		renderer.fill(150, 110, 44);
		renderer.drawEllipse(80, 500, 200, 200);
	}

}
