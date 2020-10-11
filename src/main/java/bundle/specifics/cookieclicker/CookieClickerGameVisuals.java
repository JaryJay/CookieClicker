package bundle.specifics.cookieclicker;

import bundle.visuals.GameVisuals;
import bundle.visuals.displayer.DisplayerFactory;
import bundle.visuals.renderer.GameRenderer;

public class CookieClickerGameVisuals extends GameVisuals {

	@Override
	public void display() {
		System.out.println("Drawing in " + this.getClass().getName());
	}

	@Override
	public void init(GameRenderer renderer) {
		setDisplayerFactory(new DisplayerFactory(renderer));
	}

}
