package bundle.visuals;

import bundle.BundlePart;
import bundle.visuals.displayable.Displayable;
import bundle.visuals.displayer.DisplayerFactory;
import bundle.visuals.renderer.GameRenderer;

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

	@SuppressWarnings("unchecked")
	public void display() {
		for (Displayable d : getBundle().getData().getToBeDisplayed()) {
			try {
				displayerFactory.getDisplayer(d).display(d);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
