package bundle.visuals.displayer;

import com.sun.javafx.webkit.theme.Renderer;

import bundle.visuals.displayable.Displayable;
import bundle.visuals.renderer.GameRenderer;

/**
 * An abstract displayer that displays a given {@link Displayable}. Each
 * {@link Displayer} will have a corresponding {@link Displayable}.
 * <p>
 * Example:
 * 
 * <pre>
 * public class Rectangle implements Displayable
 * public class RectangleDisplayer extends Displayer
 * </pre>
 * 
 * @author Jay
 *
 * @param <D> generic {@link Displayable}
 */
public abstract class Displayer<D extends Displayable> {

	protected GameRenderer renderer;

	/**
	 * Takes in a {@link Renderer} and saves it.
	 * 
	 * @param renderer the renderer
	 */
	public Displayer(GameRenderer renderer) {
		this.renderer = renderer;
	}

	/**
	 * Displays the given {@link Displayable};
	 * 
	 * @param displayable the displayable
	 */
	public abstract void display(D displayable);

}
