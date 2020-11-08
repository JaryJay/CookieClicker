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
			ArrayList<AbstractGUI> getGUIs = getBundle().getData().getGUIs();
			int index = 0;
			boolean consumed = false;
			for (; index < getGUIs.size(); index++) {
				AbstractGUI gui = getGUIs.get(index);
				if (gui.isOn(event.getMouseX(), event.getMouseY())) {
					if (!gui.isHovered())
						gui.onHover();
					consumed = true;
					break;
				} else if (gui.isHovered()) {
					gui.onDehover();

				}
			}
			for (index++; index < getGUIs.size(); index++) {
				AbstractGUI gui = getGUIs.get(index);
				if (gui.isHovered()) {
					gui.onDehover();
				}
			}
			return consumed;
		});
		return mouseMovedInputEventHandlers;

	}

	@Override
	protected ArrayList<MousePressedInputEventHandler> setMousePressedInputHandler() {
		ArrayList<MousePressedInputEventHandler> mousePressedInputEventHandlers = new ArrayList<>();
		mousePressedInputEventHandlers.add((event) -> {
			ArrayList<AbstractGUI> getGUIs = getBundle().getData().getGUIs();
			int index = 0;
			boolean consumed = false;
			for (; index < getGUIs.size(); index++) {
				AbstractGUI gui = getGUIs.get(index);
				if (gui.isOn(event.getMouseX(), event.getMouseY())) {
					if (!gui.isPressed())
						gui.onPress();
					consumed = true;
					break;
				} else if (gui.isPressed()) {
					gui.onRelease();

				}
			}
			for (index++; index < getGUIs.size(); index++) {
				AbstractGUI gui = getGUIs.get(index);
				if (gui.isPressed()) {
					gui.onRelease();
				}
			}
			return consumed;
		});
		return mousePressedInputEventHandlers;
	}

	@Override
	protected ArrayList<MouseReleasedInputEventHandler> setMouseReleasedInputHandler() {
		ArrayList<MouseReleasedInputEventHandler> mouseReleasedInputEventHandlers = new ArrayList<>();
		mouseReleasedInputEventHandlers.add((event) -> {
			ArrayList<AbstractGUI> getGUIs = getBundle().getData().getGUIs();
			int index = 0;
			boolean consumed = false;
			for (; index < getGUIs.size(); index++) {
				AbstractGUI gui = getGUIs.get(index);
				if (gui.isOn(event.getMouseX(), event.getMouseY())) {
					gui.onRelease();
					consumed = true;
					break;
				} else if (gui.isPressed()) {
					gui.setPressed(false);
				}
			}
			for (index++; index < getGUIs.size(); index++) {
				AbstractGUI gui = getGUIs.get(index);
				if (gui.isPressed()) {
					gui.setPressed(false);
				}
			}
			return consumed;
		});
		return mouseReleasedInputEventHandlers;
	}

	@Override
	protected ArrayList<MouseScrolledInputEventHandler> setMouseScrolledInputHandler() {
		ArrayList<MouseScrolledInputEventHandler> mouseScrolledInputEventHandlers = new ArrayList<>();
		return mouseScrolledInputEventHandlers;
	}

}
