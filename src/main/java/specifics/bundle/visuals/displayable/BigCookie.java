package specifics.bundle.visuals.displayable;

import bundle.logic.Clickable;
import bundle.visuals.displayable.Displayable;

public class BigCookie implements Displayable, Clickable {

	private float centerX = 250;
	private float centerY = 540;
	private float radius = 200f;
	private Runnable onClick;

	public BigCookie() {
		onClick = () -> {
		};
	}

	public BigCookie(float x, float y) {
		this.centerX = x;
		this.centerY = y;
		onClick = () -> {
		};
	}

	public float getCenterX() {
		return centerX;
	}

	public void setCenterX(float centerX) {
		this.centerX = centerX;
	}

	public float getCenterY() {
		return centerY;
	}

	public void setCenterY(float centerY) {
		this.centerY = centerY;
	}

	@Override
	public boolean isOn(float x, float y) {
		return (x - centerX) * (x - centerX) + (y - centerY) * (y - centerY) <= radius * radius;
	}

	@Override
	public Runnable getOnClick() {
		return onClick;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

}
