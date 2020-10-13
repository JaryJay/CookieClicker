package bundle.logic;

import bundle.BundlePart;
import bundle.data.GameData;
import bundle.input.GameInput;

/**
 * A bundle part that updates data and handles user input.
 * 
 * See {@link GameData} and {@link GameInput}.
 * 
 * @author Jay
 *
 */
public abstract class GameLogic extends BundlePart {

	public abstract void update();

	public void init() {
	}

}
