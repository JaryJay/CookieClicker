package common.coordinates;

public class RelativeCoordinates extends Coordinates {

	private HasDimensionsAndCoordinates parent;

	public RelativeCoordinates(float x, float y, HasDimensionsAndCoordinates parent) {
		super(x, y);
		this.parent = parent;
	}

	public HasDimensionsAndCoordinates getParent() {
		return parent;
	}

	public void setParent(HasDimensionsAndCoordinates parent) {
		this.parent = parent;
	}

}
