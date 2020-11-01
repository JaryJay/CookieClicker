package bundle.input.event;

import common.source.GameSource;

public class MousePressedInputEvent extends AbstractGameInputEvent {

	private int mouseButton;

	public MousePressedInputEvent(long time, GameSource source, int mouseButton) {
		super(time, source);
		this.mouseButton = mouseButton;
	}

	public int getMouseButton() {
		return mouseButton;
	}

	@Override
	public String getName() {
		return this.getName();
	}

}
