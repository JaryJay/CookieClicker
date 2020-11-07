package bundle.data.gui;

import java.util.ArrayList;

import bundle.logic.Clickable;
import bundle.logic.Hoverable;
import bundle.visuals.displayable.Displayable;
import bundle.visuals.displayer.GUIDisplayer;
import common.DoNothingRunnable;

public abstract class AbstractGUI implements Displayable, Clickable, Hoverable {

	private String text = "";
	private int topLeftX;
	private int topLeftY;
	private int width;
	private int height;
	private int backgroundR;
	private int backgroundG;
	private int backgroundB;
	private int outlineR;
	private int outlineG;
	private int outlineB;
	private int textR;
	private int textG;
	private int textB;
	private int textSize = 24;
	private int textRatio = 1;
	private boolean isTextRatio = true;

	private boolean hovered;
	private boolean pressed;

	private Runnable onPress;
	private Runnable onRelease;
	private Runnable onHover;
	private Runnable onDehover;

	private AbstractGUI parentGUI;
	private ArrayList<AbstractGUI> childrenGUIs;

	private boolean enabled;

	public AbstractGUI(String text, int topLeftX, int topLeftY, int width, int height) {
		super();
		this.text = text;
		this.topLeftX = topLeftX;
		this.topLeftY = topLeftY;
		this.width = width;
		this.height = height;
		onPress = new DoNothingRunnable();
		onRelease = new DoNothingRunnable();
		onHover = new DoNothingRunnable();
		onDehover = new DoNothingRunnable();
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getTopLeftX() {
		return topLeftX;
	}

	public void setTopLeftX(int topLeftX) {
		this.topLeftX = topLeftX;
	}

	public int getTopLeftY() {
		return topLeftY;
	}

	public void setTopLeftY(int topLeftY) {
		this.topLeftY = topLeftY;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
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

	public int getTextRatio() {
		return textRatio;
	}

	public void setTextRatio(int textRatio) {
		this.textRatio = textRatio;
	}

	public boolean isTextRatio() {
		return isTextRatio;
	}

	public void setTextRatio(boolean isTextRatio) {
		this.isTextRatio = isTextRatio;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
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

	public void setPressed(boolean pressX) {
		this.pressed = pressX;
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
	}

	public void removeChildGUI(AbstractGUI childGUI) {
		childrenGUIs.remove(childGUI);
	}

	@Override
	public boolean isOn(float x, float y) {
		boolean inboundsX = x > getTopLeftX() && x < getTopLeftX() + getWidth();
		boolean inboundsY = y > getTopLeftY() && y < getTopLeftY() + getHeight();
		return inboundsX && inboundsY;
	}

	@Override
	public Runnable getOnClick() {
		return onRelease;
	}

	public Runnable getOnPress() {
		return onPress;
	}

	public void setOnPress(Runnable onPress) {
		this.onPress = onPress;
	}

	public Runnable getOnRelease() {
		return onRelease;
	}

	protected void setOnRelease(Runnable onRelease) {
		this.onRelease = onRelease;
	}

	@Override
	public Runnable getOnHover() {
		return onHover;
	}

	public void setOnHover(Runnable onHover) {
		this.onHover = onHover;
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

}
