package bundle.data;

import java.util.ArrayList;

import bundle.BundlePart;
import bundle.visuals.displayer.Displayable;

public abstract class GameData extends BundlePart {

	private ArrayList<Displayable> toBeDisplayed;

	public ArrayList<Displayable> getToBeDisplayed() {
		return toBeDisplayed;
	}

	public void addDisplayable(Displayable displayable) {
		toBeDisplayed.add(displayable);
	}

}
