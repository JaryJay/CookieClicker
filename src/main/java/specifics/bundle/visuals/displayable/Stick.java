package specifics.bundle.visuals.displayable;

import bundle.visuals.displayable.Displayable;
import common.coordinates.PixelCoordinates;

public class Stick implements Displayable {

	private float length = 100;
	private PixelCoordinates center = new PixelCoordinates(500, 300);
	private PixelCoordinates endPoint = new PixelCoordinates(500 + length, 300);

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public PixelCoordinates getCenter() {
		return center;
	}

	public void setCenter(PixelCoordinates center) {
		this.center = center;
	}

	public PixelCoordinates getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(PixelCoordinates endPoint) {
		this.endPoint = endPoint;
	}

}
