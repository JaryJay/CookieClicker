package specifics.bundle.visuals.displayer;

import bundle.visuals.displayer.Displayer;
import bundle.visuals.renderer.GameRenderer;
import specifics.bundle.data.gui.BigCookie;

public class BigCookieDisplayer extends Displayer<BigCookie> {

	public BigCookieDisplayer(GameRenderer renderer) {
		super(renderer);
	}

	@Override
	public void display(BigCookie displayable) {
		if (displayable.isPressed()) {
			renderer.fill(125, 84, 2);
			renderer.drawEllipse(displayable.getX() + displayable.getWidth() / 2,
					displayable.getY() + displayable.getHeight() / 2, (int) (displayable.getWidth() * 0.9),
					(int) (displayable.getHeight() * 0.9));
		} else if (displayable.isHovered()) {
			renderer.fill(166, 114, 10);
			renderer.drawEllipse(displayable.getX() + displayable.getWidth() / 2,
					displayable.getY() + displayable.getHeight() / 2, (int) (displayable.getWidth() * 0.95),
					(int) (displayable.getHeight() * 0.95));
		} else {
			renderer.fill(145, 100, 10);
			renderer.drawEllipse(displayable.getX() + displayable.getWidth() / 2,
					displayable.getY() + displayable.getHeight() / 2, displayable.getWidth(), displayable.getHeight());
		}
	}

}
