package bundle.input.event;

import common.source.GameSource;

public class MouseReleasedInputEvent extends AbstractGameInputEvent {

	private int mouseButton;

	public MouseReleasedInputEvent(long time, GameSource source, int mouseButton) {
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
