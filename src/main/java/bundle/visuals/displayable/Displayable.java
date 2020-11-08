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

	/**
	 * Gets the displayable's corresponding displayer. Does so by manipulating
	 * strings.
	 * 
	 * @return the name of the displayable's corresponding displayer
	 */
	public default String getDisplayerName() {
		String displayableName = this.getClass().getName();
		int lastDotIndex = displayableName.lastIndexOf('.');
		return displayableName.substring(0, lastDotIndex - 4) + "er." + displayableName.substring(lastDotIndex + 1)
				+ "Displayer";
	}

}
