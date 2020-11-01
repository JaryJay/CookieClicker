package specifics.bundle;

import bundle.data.GameData;
import bundle.visuals.displayable.Background;
import bundle.visuals.displayable.TexturedRectangle;
import specifics.bundle.visuals.displayable.BigCookie;

public class CookieClickerGameData extends GameData {

	private int numOfCookies;
	private int mousePressedCount;

	private int numOfCursors;
	private int numOfGrandmas;
	private int numOfFarms;
	private int numOfMines;
	private int numOfFactories;
	private int numOfBanks;
	private int numOfPortals;

	public CookieClickerGameData() {
		addDisplayable(new Background(7, 115, 173));
		addDisplayable(new BigCookie());
		addDisplayable(new BigCookie(500, 200));
		addDisplayable(new BigCookie(300, 250));
		addDisplayable(new TexturedRectangle());
	}

	public int getNumOfCookies() {
		return numOfCookies;
	}

	public void setNumOfCookies(int numOfCookies) {
		this.numOfCookies = numOfCookies;
	}

	public int getMousePressedCount() {
		return mousePressedCount;
	}

	public void setMousePressedCount(int mousePressedCount) {
		this.mousePressedCount = mousePressedCount;
	}

	public int getNumOfCursors() {
		return numOfCursors;
	}

	public void setNumOfCursors(int numOfCursors) {
		this.numOfCursors = numOfCursors;
	}

	public int getNumOfGrandmas() {
		return numOfGrandmas;
	}

	public void setNumOfGrandmas(int numOfGrandmas) {
		this.numOfGrandmas = numOfGrandmas;
	}

	public int getNumOfFarms() {
		return numOfFarms;
	}

	public void setNumOfFarms(int numOfFarms) {
		this.numOfFarms = numOfFarms;
	}

	public int getNumOfMines() {
		return numOfMines;
	}

	public void setNumOfMines(int numOfMines) {
		this.numOfMines = numOfMines;
	}

	public int getNumOfFactories() {
		return numOfFactories;
	}

	public void setNumOfFactories(int numOfFactories) {
		this.numOfFactories = numOfFactories;
	}

	public int getNumOfBanks() {
		return numOfBanks;
	}

	public void setNumOfBanks(int numOfBanks) {
		this.numOfBanks = numOfBanks;
	}

	public int getNumOfPortals() {
		return numOfPortals;
	}

	public void setNumOfPortals(int numOfPortals) {
		this.numOfPortals = numOfPortals;
	}

}
