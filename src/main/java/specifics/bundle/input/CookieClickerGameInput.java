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
import specifics.bundle.data.CookieClickerGameData;

public class CookieClickerGameInput extends GameInput {

	@Override
	protected ArrayList<KeyPressedInputEventHandler> setKeyPressedInputHandler() {
		ArrayList<KeyPressedInputEventHandler> keyPressedInputEventHandlers = new ArrayList<>();
		keyPressedInputEventHandlers.add((event) -> {
			return false;
		});
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
			getBundle().getData().setMouseX(event.getMouseX());
			getBundle().getData().setMouseY(event.getMouseY());
			return false;
		});
		return mouseMovedInputEventHandlers;
	}

	@Override
	protected ArrayList<MousePressedInputEventHandler> setMousePressedInputHandler() {
		ArrayList<MousePressedInputEventHandler> mousePressedInputEventHandlers = new ArrayList<>();
		mousePressedInputEventHandlers.add((event) -> {
//			CookieClickerGameData data = (CookieClickerGameData) getBundle().getData();
//			data.setMousePressedCount(data.getMousePressedCount() + 1);
//			System.out.println("Mouse pressed " + data.getMousePressedCount() + " times!");
			return false;
		});

		return mousePressedInputEventHandlers;
	}

	@Override
	protected ArrayList<MouseReleasedInputEventHandler> setMouseReleasedInputHandler() {
		ArrayList<MouseReleasedInputEventHandler> mouseReleasedInputEventHandlers = new ArrayList<>();
		for (AbstractGUI gui : getBundle().getData().getGUIs()) {
			mouseReleasedInputEventHandlers.add((event) -> {
				CookieClickerGameData data = (CookieClickerGameData) getBundle().getData();
				if (gui.isOn(data.getMouseX(), data.getMouseY())) {
					gui.onClick();
					return true;
				}
				return false;
			});
		}
		return mouseReleasedInputEventHandlers;
	}

	@Override
	protected ArrayList<MouseScrolledInputEventHandler> setMouseScrolledInputHandler() {
		ArrayList<MouseScrolledInputEventHandler> mouseScrolledInputEventHandlers = new ArrayList<>();
		return mouseScrolledInputEventHandlers;
	}

}
