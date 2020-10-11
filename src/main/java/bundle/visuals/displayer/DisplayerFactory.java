package bundle.visuals.displayer;

import bundle.visuals.displayable.Displayable;
import bundle.visuals.displayer.specifics.CookieDisplayer;
import bundle.visuals.displayer.specifics.RectangleDisplayer;
import bundle.visuals.renderer.GameRenderer;

public class DisplayerFactory {

	private GameRenderer renderer;

	public DisplayerFactory(GameRenderer renderer) {
		this.renderer = renderer;
	}

	public Displayer getDisplayer(Displayable displayable) throws Exception {
		String name = displayable.getClass().getSimpleName();
		if (name == "Cookie") {
			return new CookieDisplayer(displayable, renderer);
		} else if (name == "Rectangle") {
			return new RectangleDisplayer(displayable, renderer);
		}
		return new CookieDisplayer(displayable, renderer);
	}

}
