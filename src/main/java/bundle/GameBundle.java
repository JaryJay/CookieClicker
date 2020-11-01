package bundle;

import java.util.ArrayList;

import bundle.data.GameData;
import bundle.input.GameInput;
import bundle.logic.GameLogic;
import bundle.visuals.GameVisuals;

/**
 * A collection of the four bundle parts needed in a game:
 * <p>
 * - Data
 * <p>
 * - Input
 * <p>
 * - Logic
 * <p>
 * - Visuals
 * 
 * @author Jay
 *
 */
public class GameBundle {

	protected GameBundleWrapper wrapper;

	protected GameData data;
	protected GameInput input;
	protected GameLogic logic;
	protected GameVisuals visuals;

	/**
	 * A constructor that takes in a game data, input, logic, and visuals. Then, the
	 * constructor sets the bundles of each of its bundle parts to itself.
	 * 
	 * @param data    GameData
	 * @param input   GameInput
	 * @param logic   GameLogic
	 * @param visuals GameVisuals
	 */
	public GameBundle(GameData data, GameInput input, GameLogic logic, GameVisuals visuals) {
		this.data = data;
		this.input = input;
		this.logic = logic;
		this.visuals = visuals;

		this.data.setBundle(this);
		this.input.setBundle(this);
		this.logic.setBundle(this);
		this.visuals.setBundle(this);
	}

	public ArrayList<AbstractBundlePart> getBundleParts() {
		ArrayList<AbstractBundlePart> parts = new ArrayList<>();
		parts.add(data);
		parts.add(input);
		parts.add(logic);
		parts.add(visuals);
		return parts;
	}

	public GameData getData() {
		return data;
	}

	public void setData(GameData data) {
		this.data = data;
	}

	public GameInput getInput() {
		return input;
	}

	public void setInput(GameInput input) {
		this.input = input;
	}

	public GameLogic getLogic() {
		return logic;
	}

	public void setLogic(GameLogic logic) {
		this.logic = logic;
	}

	public GameVisuals getVisuals() {
		return visuals;
	}

	public void setVisuals(GameVisuals visuals) {
		this.visuals = visuals;
	}

	public void initBundleParts() {
		data.init();
		input.init();
		logic.init();
		visuals.init();
	}

	public GameBundleWrapper getWrapper() {
		return wrapper;
	}

}
