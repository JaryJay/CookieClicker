package bundle.data.gui;

public class Button extends AbstractGUI {

	public Button(String text, int topLeftX, int topLeftY, int width, int height, Runnable onRelease) {
		super(text, topLeftX, topLeftY, width, height);
		setOnRelease(onRelease);
	}

}
