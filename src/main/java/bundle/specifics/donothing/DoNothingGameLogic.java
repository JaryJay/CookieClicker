package bundle.specifics.donothing;

import bundle.logic.GameLogic;

public class DoNothingGameLogic extends GameLogic {

	public DoNothingGameLogic() {
	}

	@Override
	public void update() {
		System.out.println("Doing nothing...");
	}

}
