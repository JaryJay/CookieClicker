package specifics.bundle.visuals.displayable;

import bundle.visuals.displayable.Displayable;
import common.coordinates.PixelCoordinates;
import common.coordinates.Vector2f;

public class InverseKinematics implements Displayable {

	private float armLength = 200;
	private float foreArmLength = 200;
	private boolean clockwise = true;
	private PixelCoordinates center = new PixelCoordinates(700, 500);
	private PixelCoordinates joint = new PixelCoordinates(700 + armLength, 500);
	private PixelCoordinates endPoint = new PixelCoordinates(700 + armLength + foreArmLength, 500);

	public InverseKinematics(PixelCoordinates pixelCoordinates) {
		center = pixelCoordinates;
	}

	public float getArmLength() {
		return armLength;
	}

	public void setArmLength(float armLength) {
		this.armLength = armLength;
	}

	public float getForeArmLength() {
		return foreArmLength;
	}

	public void setForeArmLength(float foreArmLength) {
		this.foreArmLength = foreArmLength;
	}

	public boolean isClockwise() {
		return clockwise;
	}

	public void setClockwise(boolean clockwise) {
		this.clockwise = clockwise;
	}

	public PixelCoordinates getCenter() {
		return center;
	}

	public PixelCoordinates getJoint() {
		return joint;
	}

	public PixelCoordinates getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(PixelCoordinates endpoint) {
		Vector2f center = getCenter().toVector();
		Vector2f centerToEndpoint = endpoint.toVector().copy().subtract(center);
		if (centerToEndpoint.getLengthSquared() > (armLength + foreArmLength) * (armLength + foreArmLength)) {
			centerToEndpoint.normalize().scale(armLength + foreArmLength);
		}
		double angleC = Math
				.acos((centerToEndpoint.getLengthSquared() + armLength * armLength - foreArmLength * foreArmLength)
						/ (2 * centerToEndpoint.getLength() * armLength));
		double theta = Math.atan2(centerToEndpoint.y, centerToEndpoint.x);
		if (clockwise) {
			this.joint = Vector2f.fromLengthAngle(armLength, (float) (theta + angleC)).add(center).toPixelCoordinates();
			this.endPoint = center.copy().add(centerToEndpoint).toPixelCoordinates();
		} else {
			this.joint = Vector2f.fromLengthAngle(armLength, (float) (theta - angleC)).add(center).toPixelCoordinates();
			this.endPoint = center.copy().add(centerToEndpoint).toPixelCoordinates();
		}
	}

}
