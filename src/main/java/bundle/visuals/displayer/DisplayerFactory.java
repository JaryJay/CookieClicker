package bundle.visuals.displayer;

import bundle.visuals.displayable.Displayable;
import bundle.visuals.displayable.TexturedRectangle;
import bundle.visuals.renderer.GameRenderer;
import specifics.bundle.visuals.displayable.BigCookie;
import specifics.bundle.visuals.displayer.BigCookieDisplayer;

public class DisplayerFactory {

	private GameRenderer renderer;

	public DisplayerFactory(GameRenderer renderer) {
		this.renderer = renderer;
	}

	@SuppressWarnings("rawtypes")
	public Displayer getDisplayer(Displayable displayable) throws Exception {
		if (displayable instanceof BigCookie) {
			return new BigCookieDisplayer((BigCookie) displayable, renderer);
		} else if (displayable instanceof TexturedRectangle) {
			return new TexturedRectangleDisplayer((TexturedRectangle) displayable, renderer);
		}
		return new BigCookieDisplayer((BigCookie) displayable, renderer);
	}

}
