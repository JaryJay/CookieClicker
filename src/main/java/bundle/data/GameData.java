package bundle.data;

import java.util.ArrayList;

import bundle.AbstractBundlePart;
import bundle.data.gui.AbstractGUI;
import bundle.data.gui.Button;
import bundle.visuals.displayable.Displayable;
import common.entity.User;
import engine.GameEngine;

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

	private int mouseX;
	private int mouseY;

	public ArrayList<Displayable> getToBeDisplayed() {
		return toBeDisplayed;
	}

	public void addDisplayable(Displayable displayable) {
		toBeDisplayed.add(displayable);
		if (displayable instanceof Button) {
			guis.add((Button) displayable);
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

	public int getMouseX() {
		return mouseX;
	}

	/**
	 * Setter for the x position of the cursor. Should only be used by a
	 * {@link GameEngine}.
	 * 
	 * @param mouseX the x-coordinate of the cursor
	 */
	public void setMouseX(int mouseX) {
		this.mouseX = mouseX;
	}

	public int getMouseY() {
		return mouseY;
	}

	/**
	 * Setter for the x position of the cursor. Should only be used by a
	 * {@link GameEngine}.
	 * 
	 * @param mouseY the y-coordinate of the cursor
	 */
	public void setMouseY(int mouseY) {
		this.mouseY = mouseY;
	}

}
