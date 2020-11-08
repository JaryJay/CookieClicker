package specifics.bundle.data.building;

import bundle.visuals.displayable.Displayable;

public class Cursor extends AbstractBuilding implements Moving, Displayable {

	private long moveTime;

	@Override
	public long getMoveTime() {
		return moveTime;
	}

}
