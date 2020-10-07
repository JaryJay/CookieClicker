package bundle.visuals.displayer;

import bundle.visuals.displayer.renderer.GameRenderer;
import bundle.visuals.displayer.specifics.CookieDisplayer;

public class DisplayerFactory {

	private GameRenderer renderer;

	public DisplayerFactory(GameRenderer renderer) {
		this.renderer = renderer;
	}

	public Displayer getDisplayer(Displayable displayable) {
		// TODO
		return new CookieDisplayer(renderer);
	}

}
