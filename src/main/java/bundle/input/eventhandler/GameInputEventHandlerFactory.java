package bundle.input.eventhandler;

import java.util.ArrayList;

import bundle.input.event.AbstractGameInputEvent;
import bundle.input.event.KeyPressedInputEvent;
import bundle.input.event.KeyReleasedInputEvent;
import bundle.input.event.MouseMovedInputEvent;
import bundle.input.event.MousePressedInputEvent;
import bundle.input.event.MouseReleasedInputEvent;
import bundle.input.event.MouseScrolledInputEvent;

public class GameInputEventHandlerFactory {

	private ArrayList<KeyPressedInputEventHandler> keyPressedInputHandlers;
	private ArrayList<KeyReleasedInputEventHandler> keyReleasedInputHandlers;
	private ArrayList<MouseMovedInputEventHandler> mouseMovedInputHandlers;
	private ArrayList<MousePressedInputEventHandler> mousePressedInputHandlers;
	private ArrayList<MouseReleasedInputEventHandler> mouseReleasedInputHandlers;
	private ArrayList<MouseScrolledInputEventHandler> mouseScrolledInputHandlers;

	@SuppressWarnings("rawtypes")
	public ArrayList<? extends AbstractGameInputEventHandler> getHandlers(
			Class<? extends AbstractGameInputEvent> eventClass) {
		if (eventClass == KeyPressedInputEvent.class)
			return keyPressedInputHandlers;
		if (eventClass == KeyReleasedInputEvent.class)
			return keyReleasedInputHandlers;
		if (eventClass == MouseMovedInputEvent.class)
			return mouseMovedInputHandlers;
		if (eventClass == MousePressedInputEvent.class)
			return mousePressedInputHandlers;
		if (eventClass == MouseReleasedInputEvent.class)
			return mouseReleasedInputHandlers;
		if (eventClass == MouseScrolledInputEvent.class)
			return mouseScrolledInputHandlers;
		return null;
	}

	public void setKeyPressedInputHandlers(ArrayList<KeyPressedInputEventHandler> keyPressedInputHandlers) {
		this.keyPressedInputHandlers = keyPressedInputHandlers;
	}

	public void setKeyReleasedInputHandlers(ArrayList<KeyReleasedInputEventHandler> keyReleasedInputHandlers) {
		this.keyReleasedInputHandlers = keyReleasedInputHandlers;
	}

	public void setMouseMovedInputHandlers(ArrayList<MouseMovedInputEventHandler> mouseMovedInputHandlers) {
		this.mouseMovedInputHandlers = mouseMovedInputHandlers;
	}

	public void setMousePressedInputHandlers(ArrayList<MousePressedInputEventHandler> mousePressedInputHandlers) {
		this.mousePressedInputHandlers = mousePressedInputHandlers;
	}

	public void setMouseReleasedInputHandlers(ArrayList<MouseReleasedInputEventHandler> mouseReleasedInputHandlers) {
		this.mouseReleasedInputHandlers = mouseReleasedInputHandlers;
	}

	public void setMouseScrolledInputHandlers(ArrayList<MouseScrolledInputEventHandler> mouseScrolledInputHandlers) {
		this.mouseScrolledInputHandlers = mouseScrolledInputHandlers;
	}

}
