package bundle.data.gui;

import java.util.ArrayList;

import bundle.logic.Clickable;
import bundle.logic.Hoverable;
import bundle.visuals.displayable.Displayable;
import bundle.visuals.displayer.GUIDisplayer;
import common.DoNothingRunnable;
import common.coordinates.HasDimensionsAndCoordinates;
import common.coordinates.PixelCoordinates;

public abstract class AbstractGUI implements Displayable, Clickable, Hoverable, HasDimensionsAndCoordinates {

	private String text = "";
	private float x;
	private float y;
	private float width;
	private float height;
	private int backgroundR = 255;
	private int backgroundG = 255;
	private int backgroundB = 255;
	private int outlineR = 0;
	private int outlineG = 0;
	private int outlineB = 0;
	private int textR = 0;
	private int textG = 0;
	private int textB = 0;
	private int textSize = 24;

	private boolean hovered = false;
	private boolean pressed = false;

	private Runnable onPress;
	private Runnable onRelease;
	private Runnable onClick;
	private Runnable onHover;
	private Runnable onDehover;

	private AbstractGUI parentGUI;
	private ArrayList<AbstractGUI> childrenGUIs;

	private boolean enabled;

	public AbstractGUI(String text, int X, int Y, int width, int height) {
		super();
		this.text = text;
		this.x = X;
		this.y = Y;
		this.width = width;
		this.height = height;
		onPress = new DoNothingRunnable();
		onRelease = new DoNothingRunnable();
		onClick = new DoNothingRunnable();
		onHover = new DoNothingRunnable();
		onDehover = new DoNothingRunnable();

		childrenGUIs = new ArrayList<>();
		enabled = true;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public float getX() {
		return x;
	}

	public void setX(float X) {
		this.x = X;
	}

	public float getY() {
		return y;
	}

	public void setY(float Y) {
		this.y = Y;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public int getBackgroundR() {
		return backgroundR;
	}

	public void setBackgroundR(int backgroundR) {
		this.backgroundR = backgroundR;
	}

	public int getBackgroundG() {
		return backgroundG;
	}

	public void setBackgroundG(int backgroundG) {
		this.backgroundG = backgroundG;
	}

	public int getBackgroundB() {
		return backgroundB;
	}

	public void setBackgroundB(int backgroundB) {
		this.backgroundB = backgroundB;
	}

	public int getOutlineR() {
		return outlineR;
	}

	public void setOutlineR(int outlineR) {
		this.outlineR = outlineR;
	}

	public int getOutlineG() {
		return outlineG;
	}

	public void setOutlineG(int outlineG) {
		this.outlineG = outlineG;
	}

	public int getOutlineB() {
		return outlineB;
	}

	public void setOutlineB(int outlineB) {
		this.outlineB = outlineB;
	}

	public int getTextR() {
		return textR;
	}

	public void setTextR(int textR) {
		this.textR = textR;
	}

	public int getTextG() {
		return textG;
	}

	public void setTextG(int textG) {
		this.textG = textG;
	}

	public int getTextB() {
		return textB;
	}

	public void setTextB(int textB) {
		this.textB = textB;
	}

	public int getTextSize() {
		return textSize;
	}

	public void setTextSize(int textSize) {
		this.textSize = textSize;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void enable() {
		this.enabled = true;
	}

	public void disable() {
		this.enabled = false;
		for (AbstractGUI child : childrenGUIs) {
			child.disable();
		}
	}

	public boolean isHovered() {
		return hovered;
	}

	public void setHovered(boolean hovered) {
		this.hovered = hovered;
	}

	public boolean isPressed() {
		return pressed;
	}

	public void setPressed(boolean pressed) {
		this.pressed = pressed;
	}

	public AbstractGUI getParentGUI() {
		return parentGUI;
	}

	public void setParentGUI(AbstractGUI parentGUI) {
		this.parentGUI = parentGUI;
	}

	public ArrayList<AbstractGUI> getChildrenGUIs() {
		return childrenGUIs;
	}

	public void addChildGUI(AbstractGUI childGUI) {
		childrenGUIs.add(childGUI);
		childGUI.setParentGUI(this);
	}

	public void removeChildGUI(AbstractGUI childGUI) {
		childrenGUIs.remove(childGUI);
	}

	@Override
	public boolean isOn(float x, float y) {
		boolean inboundsX = x > getX() && x < getX() + getWidth();
		boolean inboundsY = y > getY() && y < getY() + getHeight();
		return inboundsX && inboundsY;
	}

	@Override
	public final void onPress() {
		pressed = true;
		getOnPress().run();
	}

	@Override
	public Runnable getOnPress() {
		return onPress;
	}

	public void setOnPress(Runnable onPress) {
		this.onPress = onPress;
	}

	@Override
	public final void onRelease() {
		if (pressed) {
			onClick();
		}
		pressed = false;
		getOnRelease().run();
	}

	@Override
	public Runnable getOnRelease() {
		return onRelease;
	}

	protected void setOnRelease(Runnable onRelease) {
		this.onRelease = onRelease;
	}

	@Override
	public Runnable getOnClick() {
		return onClick;
	}

	public void setOnClick(Runnable onClick) {
		this.onClick = onClick;
	}

	@Override
	public final void onHover() {
		hovered = true;
		onHover.run();
	}

	@Override
	public Runnable getOnHover() {
		return onHover;
	}

	public void setOnHover(Runnable onHover) {
		this.onHover = onHover;
	}

	@Override
	public final void onDehover() {
		hovered = false;
		onDehover.run();
	}

	@Override
	public Runnable getOnDehover() {
		return onDehover;
	}

	public void setOnDehover(Runnable onDehover) {
		this.onDehover = onDehover;
	}

	@Override
	public String getDisplayerName() {
		return GUIDisplayer.class.getName();
	}

	@Override
	public PixelCoordinates getCoordinates() {
		return new PixelCoordinates(x, y);
	}

	@Override
	public PixelCoordinates getDimensions() {
		return new PixelCoordinates(width, height);
	}

	@Override
	public void setCoordinates(PixelCoordinates coordinates) {
		x = coordinates.x;
		y = coordinates.y;
	}

	@Override
	public void setDimensions(PixelCoordinates dimensions) {
		width = dimensions.x;
		height = dimensions.y;
	}

}
