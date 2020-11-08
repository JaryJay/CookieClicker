package bundle.data;

import java.util.ArrayList;

import bundle.AbstractBundlePart;
import bundle.data.gui.AbstractGUI;
import bundle.data.gui.Button;
import bundle.visuals.displayable.Displayable;
import common.entity.User;

/**
 * A bundle part that stores data.
 * 
 * @author Jay
 *
 */
public abstract class GameData extends AbstractBundlePart {

	/**
	 * An arraylist of displayables that the game would display.
	 */
	private ArrayList<Displayable> toBeDisplayed = new ArrayList<>();
	/**
	 * An arraylist of GUIs that the game might display.
	 */
	private ArrayList<AbstractGUI> guis = new ArrayList<>();
	private User user;

	public ArrayList<Displayable> getToBeDisplayed() {
		return toBeDisplayed;
	}

	public void addDisplayable(Displayable displayable) {
		toBeDisplayed.add(displayable);
		if (displayable instanceof Button) {
			guis.add(0, (Button) displayable);
		}
	}

	public ArrayList<AbstractGUI> getGUIs() {
		return guis;
	}

	public void init() {
		user = new User("Jay", 0); // TODO: Let the player decide their name and auto-generate the id.
	}

	public User getUser() {
		return user;
	}

}
