package bundle.specifics.donothing;

import bundle.GameBundle;
import bundle.GameBundleWrapper;
import bundle.specifics.donothing.DoNothingGameData;
import bundle.specifics.donothing.DoNothingGameInput;
import bundle.specifics.donothing.DoNothingGameLogic;
import bundle.specifics.donothing.DoNothingGameVisuals;

public class DoNothingGameBundleWrapper extends GameBundleWrapper {

	public DoNothingGameBundleWrapper() {
		super(createInitialBundle());
	}

	private static GameBundle createInitialBundle() {
		DoNothingGameData data = new DoNothingGameData();
		DoNothingGameInput input = new DoNothingGameInput();
		DoNothingGameLogic logic = new DoNothingGameLogic();
		DoNothingGameVisuals visuals = new DoNothingGameVisuals();

		return new GameBundle(data, input, logic, visuals);
	}
}
