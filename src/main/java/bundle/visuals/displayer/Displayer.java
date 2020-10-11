package bundle.visuals.displayer;

import bundle.visuals.displayable.Displayable;
import bundle.visuals.renderer.GameRenderer;

public abstract class Displayer {

	protected Displayable displayable;
	protected GameRenderer renderer;

	public Displayer(Displayable displayable, GameRenderer renderer) {
		super();
		this.displayable = displayable;
		this.renderer = renderer;
	}

	public abstract void display();

}
