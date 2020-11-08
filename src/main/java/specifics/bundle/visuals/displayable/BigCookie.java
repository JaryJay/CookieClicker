package specifics.bundle.visuals.displayable;

import bundle.data.gui.Button;
import specifics.bundle.visuals.displayer.BigCookieDisplayer;

public class BigCookie extends Button {

	public BigCookie(float centerX, float centerY, float radius, Runnable onClick) {
		super("", (int) (centerX - radius), (int) (centerY - radius), (int) radius * 2, (int) radius * 2, onClick);
		setBackgroundR(181);
		setBackgroundG(124);
		setBackgroundB(18);
	}

	@Override
	public boolean isOn(float x, float y) {
		float dx = x - getTopLeftX() - getWidth() / 2;
		float dy = y - getTopLeftY() - getHeight() / 2;
		return dx * dx + dy * dy <= 0.25f * getWidth() * getHeight();
	}

	@Override
	public String getDisplayerName() {
		return BigCookieDisplayer.class.getName();
	}

}
