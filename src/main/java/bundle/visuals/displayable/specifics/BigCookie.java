package bundle.visuals.displayable.specifics;

import bundle.visuals.displayable.Displayable;
import common.Clickable;

public class BigCookie implements Displayable, Clickable {

	private float centerX = 250;
	private float centerY = 540;
	private float radius = 200f;
	private Runnable onClick;

	public BigCookie() {
		onClick = () -> {

		};
	}

	@Override
	public boolean isOn(float x, float y) {
		return (x - centerX) * (x - centerX) + (y - centerY) * (y - centerY) <= radius * radius;
	}

	@Override
	public Runnable getOnClick() {
		return onClick;
	}

	public float getRADIUS() {
		return radius;
	}

	public void setRADIUS(float radius) {
		this.radius = radius;
	}

}
