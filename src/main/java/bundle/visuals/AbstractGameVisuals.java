package bundle.visuals;

import bundle.AbstractBundlePart;
import bundle.data.AbstractGameData;
import bundle.visuals.displayable.Displayable;
import bundle.visuals.displayer.DisplayerFactory;

/**
 * A bundle part that displays visuals based on data from {@link AbstractGameData}.
 * 
 * @author Jay
 *
 */
public abstract class AbstractGameVisuals extends AbstractBundlePart {

	private DisplayerFactory displayerFactory;

	public void init() {
		this.displayerFactory = new DisplayerFactory(getBundle().getWrapper().getRenderer());
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
