package bundle.logic;

public interface Clickable {

	/**
	 * Determines if a pixel at (x, y) is on the clickable.
	 * 
	 * @param x x coordinates of the pixel
	 * @param y y coordinates of the pixel
	 * @return Whether or not the pixel at (x, y) is on the clickable
	 */
	public boolean isOn(float x, float y);

	public default void onClick() {
		getOnClick().run();
	}

	public Runnable getOnClick();

}
