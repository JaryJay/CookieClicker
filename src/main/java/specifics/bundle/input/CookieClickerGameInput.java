package specifics.bundle.input;

import java.util.ArrayList;

import bundle.data.gui.AbstractGUI;
import bundle.input.GameInput;
import bundle.input.eventhandler.KeyPressedInputEventHandler;
import bundle.input.eventhandler.KeyReleasedInputEventHandler;
import bundle.input.eventhandler.MouseMovedInputEventHandler;
import bundle.input.eventhandler.MousePressedInputEventHandler;
import bundle.input.eventhandler.MouseReleasedInputEventHandler;
import bundle.input.eventhandler.MouseScrolledInputEventHandler;

public class CookieClickerGameInput extends GameInput {

	@Override
	protected ArrayList<KeyPressedInputEventHandler> setKeyPressedInputHandler() {
		ArrayList<KeyPressedInputEventHandler> keyPressedInputEventHandlers = new ArrayList<>();
		return keyPressedInputEventHandlers;
	}

	@Override
	protected ArrayList<KeyReleasedInputEventHandler> setKeyReleasedInputHandler() {
		ArrayList<KeyReleasedInputEventHandler> keyReleasedInputEventHandlers = new ArrayList<>();
		return keyReleasedInputEventHandlers;
	}

	@Override
	protected ArrayList<MouseMovedInputEventHandler> setMouseMovedInputHandler() {
		ArrayList<MouseMovedInputEventHandler> mouseMovedInputEventHandlers = new ArrayList<>();
		mouseMovedInputEventHandlers.add((event) -> {
			for (AbstractGUI gui : getBundle().getData().getGUIs()) {
				if (gui.isOn(event.getMouseX(), event.getMouseY())) {
					gui.onHover();
					return true;
				}
				gui.onDehover();
				return false;
			}
			return false;
		});
		return mouseMovedInputEventHandlers;
	}

	@Override
	protected ArrayList<MousePressedInputEventHandler> setMousePressedInputHandler() {
		ArrayList<MousePressedInputEventHandler> mousePressedInputEventHandlers = new ArrayList<>();
		mousePressedInputEventHandlers.add((event) -> {
			for (AbstractGUI gui : getBundle().getData().getGUIs()) {
				if (gui.isOn(event.getMouseX(), event.getMouseY())) {
					gui.setPressed(true);
					return true;
				}
			}
			return false;
		});
		return mousePressedInputEventHandlers;
	}

	@Override
	protected ArrayList<MouseReleasedInputEventHandler> setMouseReleasedInputHandler() {
		ArrayList<MouseReleasedInputEventHandler> mouseReleasedInputEventHandlers = new ArrayList<>();
		mouseReleasedInputEventHandlers.add((event) -> {
			for (AbstractGUI gui : getBundle().getData().getGUIs()) {
				if (gui.isPressed() && gui.isOn(event.getMouseX(), event.getMouseY())) {
					gui.onClick();
					gui.setPressed(false);
					return true;
				}
			}
			return false;
		});
		return mouseReleasedInputEventHandlers;
	}

	@Override
	protected ArrayList<MouseScrolledInputEventHandler> setMouseScrolledInputHandler() {
		ArrayList<MouseScrolledInputEventHandler> mouseScrolledInputEventHandlers = new ArrayList<>();
		return mouseScrolledInputEventHandlers;
	}

}
