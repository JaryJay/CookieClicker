package bundle.data;

import java.util.ArrayList;

import bundle.BundlePart;
import bundle.visuals.displayable.Displayable;

public abstract class GameData extends BundlePart {

	private ArrayList<Displayable> toBeDisplayed = new ArrayList<>();

	public ArrayList<Displayable> getToBeDisplayed() {
		return toBeDisplayed;
	}

	public void addDisplayable(Displayable displayable) {
		toBeDisplayed.add(displayable);
	}

	public void init() {
	}

}
