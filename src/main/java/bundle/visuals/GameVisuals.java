package bundle.visuals;

import bundle.BundlePart;
import bundle.visuals.displayer.Displayable;
import bundle.visuals.displayer.Displayer;
import bundle.visuals.displayer.DisplayerFactory;
import bundle.visuals.displayer.renderer.GameRenderer;

public abstract class GameVisuals extends BundlePart {

	private DisplayerFactory displayerFactory;

	public void init(GameRenderer renderer) {
		this.displayerFactory = new DisplayerFactory(renderer);
	}

	public DisplayerFactory getDisplayerFactory() {
		return displayerFactory;
	}

	public void setDisplayerFactory(DisplayerFactory displayerFactory) {
		this.displayerFactory = displayerFactory;
	}

	public void display() {
		for (Displayable d : getBundle().getData().getToBeDisplayed()) {
			Displayer displayer = displayerFactory.getDisplayer(d);
			displayer.display();
		}
	}

}
