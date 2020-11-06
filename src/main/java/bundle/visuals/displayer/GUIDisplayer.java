package bundle.visuals.displayer;

import bundle.data.gui.AbstractGUI;
import bundle.visuals.renderer.GameRenderer;

public class GUIDisplayer extends Displayer<AbstractGUI> {

	public GUIDisplayer(GameRenderer renderer) {
		super(renderer);
	}

	@Override
	public void display(AbstractGUI displayable) {
		if (!displayable.isEnabled())
			return;
		renderer.outlineColour(displayable.getOutlineR(), displayable.getOutlineG(), displayable.getBackgroundB());
		renderer.fill(displayable.getBackgroundR(), displayable.getBackgroundG(), displayable.getBackgroundB());
		renderer.drawRectangle(displayable.getTopLeftX(), displayable.getTopLeftY(), displayable.getWidth(),
				displayable.getHeight());
		renderer.fill(displayable.getTextR(), displayable.getTextG(), displayable.getTextB());
		renderer.textSize(displayable.getTextSize());
		renderer.text(displayable.getText(), displayable.getTopLeftX() + displayable.getWidth() / 2,
				displayable.getTopLeftY() + displayable.getHeight() / 2);
	}

}
