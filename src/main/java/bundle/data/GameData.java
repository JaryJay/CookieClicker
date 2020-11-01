package bundle.data;

import java.util.ArrayList;

import bundle.AbstractBundlePart;
import bundle.visuals.displayable.Displayable;
import common.entity.User;

/**
 * A bundle part that stores data.
 * 
 * @author Jay
 *
 */
public abstract class GameData extends AbstractBundlePart {

	private ArrayList<Displayable> toBeDisplayed = new ArrayList<>();
	private User user;

	public ArrayList<Displayable> getToBeDisplayed() {
		return toBeDisplayed;
	}

	public void addDisplayable(Displayable displayable) {
		toBeDisplayed.add(displayable);
	}

	public void init() {
		user = new User("Jay", 0); // TODO: Let the player decide their name and auto-generate the id.
	}

	public User getUser() {
		return user;
	}

}
