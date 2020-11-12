package common.coordinates;

public abstract class Coordinates {

	public float x;
	public float y;

	public Coordinates(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

}
