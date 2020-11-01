package bundle.logic;

import bundle.AbstractBundlePart;
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
public abstract class GameLogic extends AbstractBundlePart {

	public abstract void update();

	public void init() {
	}

}
