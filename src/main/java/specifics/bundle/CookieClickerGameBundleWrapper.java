package specifics.bundle;

import bundle.GameBundle;
import bundle.GameBundleWrapper;
import specifics.bundle.data.CookieClickerGameData;
import specifics.bundle.input.CookieClickerGameInput;
import specifics.bundle.logic.CookieClickerGameLogic;
import specifics.bundle.visuals.CookieClickerGameVisuals;

public class CookieClickerGameBundleWrapper extends GameBundleWrapper {

	public CookieClickerGameBundleWrapper() {
		super(createInitialBundle());
	}

	private static GameBundle createInitialBundle() {
		CookieClickerGameData data = new CookieClickerGameData();
		CookieClickerGameInput input = new CookieClickerGameInput();
		CookieClickerGameLogic logic = new CookieClickerGameLogic();
		CookieClickerGameVisuals visuals = new CookieClickerGameVisuals();

		return new GameBundle(data, input, logic, visuals);
	}
}
