package specifics.bundle.data;

import bundle.data.GameData;
import bundle.data.gui.Label;
import bundle.visuals.displayable.Background;
import common.coordinates.PixelCoordinates;
import specifics.bundle.data.gui.BigCookie;
import specifics.bundle.visuals.displayable.InverseKinematics;

public class CookieClickerGameData extends GameData {

	private long numOfCookies = 0;

	private long numOfCursors = 1;
	private long cursorCps = 1;
	private long numOfGrandmas;
	private long numOfFarms;
	private long numOfMines;
	private long numOfFactories;
	private long numOfBanks;
	private long numOfPortals;

	private InverseKinematics inverseKinematics = new InverseKinematics(new PixelCoordinates(500, 500));
	private InverseKinematics inverseKinematics2 = new InverseKinematics(new PixelCoordinates(400, 500));

	public CookieClickerGameData() {
		addDisplayable(new Background(7, 115, 173));
		Label label = new Label("" + numOfCookies, 150, 60, 200, 80);
		addDisplayable(new BigCookie(250, 370, 200, () -> {
			numOfCookies += 1l;
//			label.setText("" + numOfCookies);
			inverseKinematics.setClockwise(!inverseKinematics.isClockwise());
			inverseKinematics2.setClockwise(!inverseKinematics2.isClockwise());
		}));
		label.setBackgroundB(0);
//		addDisplayable(label);
//		inverseKinematics.setClockwise(false);
		addDisplayable(inverseKinematics);
		addDisplayable(inverseKinematics2);
	}

	public InverseKinematics getInverseKinematics() {
		return inverseKinematics;
	}

	public InverseKinematics getInverseKinematics2() {
		return inverseKinematics2;
	}

	public long getNumOfCookies() {
		return numOfCookies;
	}

	public void setNumOfCookies(long numOfCookies) {
		this.numOfCookies = numOfCookies;
	}

	public long getNumOfCursors() {
		return numOfCursors;
	}

	public long getCursorCps() {
		return cursorCps;
	}

	public void setCursorCps(long cursorCps) {
		this.cursorCps = cursorCps;
	}

	public void setNumOfCursors(long numOfCursors) {
		this.numOfCursors = numOfCursors;
	}

	public long getNumOfGrandmas() {
		return numOfGrandmas;
	}

	public void setNumOfGrandmas(long numOfGrandmas) {
		this.numOfGrandmas = numOfGrandmas;
	}

	public long getNumOfFarms() {
		return numOfFarms;
	}

	public void setNumOfFarms(long numOfFarms) {
		this.numOfFarms = numOfFarms;
	}

	public long getNumOfMines() {
		return numOfMines;
	}

	public void setNumOfMines(long numOfMines) {
		this.numOfMines = numOfMines;
	}

	public long getNumOfFactories() {
		return numOfFactories;
	}

	public void setNumOfFactories(long numOfFactories) {
		this.numOfFactories = numOfFactories;
	}

	public long getNumOfBanks() {
		return numOfBanks;
	}

	public void setNumOfBanks(long numOfBanks) {
		this.numOfBanks = numOfBanks;
	}

	public long getNumOfPortals() {
		return numOfPortals;
	}

	public void setNumOfPortals(long numOfPortals) {
		this.numOfPortals = numOfPortals;
	}

}
