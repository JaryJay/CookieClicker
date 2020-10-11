package common;

public interface Clickable {

	public boolean isOn(float x, float y);

	public default void onClick() {
		getOnClick().run();
	}

	public Runnable getOnClick();

}
