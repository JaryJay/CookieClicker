package common.coordinates;

public class RelativeCoordinates extends Coordinates {

	HasDimensionsAndCoordinates target;

	public RelativeCoordinates(int x, int y, HasDimensionsAndCoordinates target) {
		super(x, y);
		this.target = target;
	}

}
