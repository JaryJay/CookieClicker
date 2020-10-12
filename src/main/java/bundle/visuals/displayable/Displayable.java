package bundle.visuals.displayable;

import bundle.visuals.displayer.Displayer;

/**
 * An interface for describing things that can be displayed.
 * <p>
 * If you want to add a {@link Displayable}, make sure you also add a
 * corresponding {@link Displayer}. To do so, follow the steps outlined below:
 * <p>
 * 1. Make a class implementing the {@link Displayable} interface.
 * <p>
 * 2. Make a class extending the {@link Displayer} class. You must give the
 * class the same name as the Displayable with the suffix "Displayer".
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
 */
public interface Displayable {

	public default String getName() {
		return this.getClass().getName();
	}

}
