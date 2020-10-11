package bundle.visuals.displayer;

import bundle.visuals.displayable.Displayable;
import bundle.visuals.renderer.GameRenderer;

public abstract class Displayer<D extends Displayable> {

	protected D displayable;
	protected GameRenderer renderer;

	public Displayer(D displayable, GameRenderer renderer) {
		super();
		this.displayable = displayable;
		this.renderer = renderer;
	}

	public abstract void display();

}
