package bundle.visuals.displayer.specifics;

import bundle.visuals.displayable.Displayable;
import bundle.visuals.displayable.specifics.Cookie;
import bundle.visuals.displayable.specifics.CookieType;
import bundle.visuals.displayer.Displayer;
import bundle.visuals.renderer.GameRenderer;

public class CookieDisplayer extends Displayer {

	public CookieDisplayer(Displayable displayable, GameRenderer renderer) throws Exception {
		super(displayable, renderer);
		if (!(displayable instanceof Cookie)) {
			throw new Exception(this.getClass().getName() + " constructor received a displayable that was not a cookie.");
		}
	}

	@Override
	public void display() {
		Cookie cookie = (Cookie) displayable;
		if (cookie.getCookieType() == CookieType.NORMAL)
			renderer.fill(150, 110, 44);
		else if (cookie.getCookieType() == CookieType.CHOCOLATE)
			renderer.fill(82, 53, 17);
		else if (cookie.getCookieType() == CookieType.SUGAR)
			renderer.fill(235, 178, 108);
		else if (cookie.getCookieType() == CookieType.WALNUT)
			renderer.fill(173, 116, 45);
		renderer.drawEllipse(180, 300, 200, 200);
	}

}
