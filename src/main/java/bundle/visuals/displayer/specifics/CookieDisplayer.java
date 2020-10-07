package bundle.visuals.displayer.specifics;

import bundle.visuals.displayer.Displayer;
import bundle.visuals.displayer.renderer.GameRenderer;

public class CookieDisplayer extends Displayer{
	
	public CookieDisplayer() {
	}
	
	@Override
	public void display(GameRenderer r) {
		r.fill(150, 110, 44);
		r.drawEllipse(80, 500, 200, 200);
	}

}
