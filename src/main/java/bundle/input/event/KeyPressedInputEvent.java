package bundle.input.event;

import common.source.GameSource;

public class KeyPressedInputEvent extends AbstractGameInputEvent {

	private int keyCode;

	public KeyPressedInputEvent(long time, GameSource source, int keyCode) {
		super(time, source);
		this.keyCode = keyCode;
	}

	public int getKeyCode() {
		return keyCode;
	}

	@Override
	public String getName() {
		return this.getName();
	}

}
