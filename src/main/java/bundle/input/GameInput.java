package bundle.input;

import java.util.ArrayList;

import bundle.AbstractBundlePart;
import bundle.data.gui.AbstractGUI;
import bundle.input.event.AbstractGameInputEvent;
import bundle.input.eventhandler.AbstractGameInputEventHandler;
import bundle.input.eventhandler.GameInputEventHandlerFactory;
import bundle.input.eventhandler.KeyPressedInputEventHandler;
import bundle.input.eventhandler.KeyReleasedInputEventHandler;
import bundle.input.eventhandler.MouseMovedInputEventHandler;
import bundle.input.eventhandler.MousePressedInputEventHandler;
import bundle.input.eventhandler.MouseReleasedInputEventHandler;
import bundle.input.eventhandler.MouseScrolledInputEventHandler;
import common.coordinates.PixelCoordinates;

/**
 * A bundle part that handles user input.
 * 
 * @author Jay
 *
 */
public abstract class GameInput extends AbstractBundlePart {

	private GameInputBuffer inputBuffer;
	private GameInputEventHandlerFactory inputEventHandlerFactory;

	public void handleAll() {
		while (!inputBuffer.isEmpty()) {
			handleEvent(inputBuffer.getNext());
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void handleEvent(AbstractGameInputEvent inputEvent) {
		ArrayList<? extends AbstractGameInputEventHandler> handlers = inputEventHandlerFactory
				.getHandlers(inputEvent.getClass());
		for (AbstractGameInputEventHandler handler : handlers) {
			boolean handled = handler.handle(inputEvent);
			if (handled)
				break;
		}
	}

	protected abstract ArrayList<KeyPressedInputEventHandler> setKeyPressedInputHandler();

	protected abstract ArrayList<KeyReleasedInputEventHandler> setKeyReleasedInputHandler();

	protected abstract ArrayList<MouseMovedInputEventHandler> setMouseMovedInputHandler();

	protected abstract ArrayList<MouseReleasedInputEventHandler> setMouseReleasedInputHandler();

	protected abstract ArrayList<MousePressedInputEventHandler> setMousePressedInputHandler();

	protected abstract ArrayList<MouseScrolledInputEventHandler> setMouseScrolledInputHandler();

	protected final ArrayList<KeyPressedInputEventHandler> setAllKeyPressedInputHandler() {
		ArrayList<KeyPressedInputEventHandler> keyPressedInputEventHandlers = new ArrayList<>();
		ArrayList<KeyPressedInputEventHandler> setKeyPressedInputHandler = setKeyPressedInputHandler();
		if (setKeyPressedInputHandler != null) {
			keyPressedInputEventHandlers.addAll(setKeyPressedInputHandler);
		}
		return keyPressedInputEventHandlers;
	}

	protected final ArrayList<KeyReleasedInputEventHandler> setAllKeyReleasedInputHandler() {
		ArrayList<KeyReleasedInputEventHandler> keyReleasedInputEventHandlers = new ArrayList<>();
		ArrayList<KeyReleasedInputEventHandler> setKeyReleasedInputHandler = setKeyReleasedInputHandler();
		if (setKeyReleasedInputHandler != null) {
			keyReleasedInputEventHandlers.addAll(setKeyReleasedInputHandler);
		}
		return keyReleasedInputEventHandlers;
	}

	protected final ArrayList<MouseMovedInputEventHandler> setAllMouseMovedInputHandler() {
		ArrayList<MouseMovedInputEventHandler> mouseMovedInputEventHandlers = new ArrayList<>();
		ArrayList<MouseMovedInputEventHandler> setMouseMovedInputHandler = setMouseMovedInputHandler();
		if (setMouseMovedInputHandler != null) {
			mouseMovedInputEventHandlers.addAll(setMouseMovedInputHandler);
		}
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
		mouseMovedInputEventHandlers.add((event) -> {
			getBundle().getData().setCursorCoordinates(new PixelCoordinates(event.getMouseX(), event.getMouseY()));
			return false;
		});
		return mouseMovedInputEventHandlers;
	}

	protected final ArrayList<MousePressedInputEventHandler> setAllMousePressedInputHandler() {
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
		ArrayList<MousePressedInputEventHandler> setMousePressedInputHandler = setMousePressedInputHandler();
		if (setMousePressedInputHandler != null) {
			mousePressedInputEventHandlers.addAll(setMousePressedInputHandler);
		}
		return mousePressedInputEventHandlers;
	}

	protected final ArrayList<MouseReleasedInputEventHandler> setAllMouseReleasedInputHandler() {
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
		ArrayList<MouseReleasedInputEventHandler> setMouseReleasedInputHandler = setMouseReleasedInputHandler();
		if (setMouseReleasedInputHandler != null) {
			mouseReleasedInputEventHandlers.addAll(setMouseReleasedInputHandler);
		}
		return mouseReleasedInputEventHandlers;
	}

	protected final ArrayList<MouseScrolledInputEventHandler> setAllMouseScrolledInputHandler() {
		ArrayList<MouseScrolledInputEventHandler> mouseScrolledInputEventHandlers = new ArrayList<>();
		ArrayList<MouseScrolledInputEventHandler> setMouseScrolledInputHandler = setMouseScrolledInputHandler();
		if (setMouseScrolledInputHandler != null) {
			mouseScrolledInputEventHandlers.addAll(setMouseScrolledInputHandler);
		}
		return mouseScrolledInputEventHandlers;
	}

	public void init() {
		inputBuffer = getBundle().getWrapper().getInputBuffer();
		inputEventHandlerFactory = new GameInputEventHandlerFactory();
		inputEventHandlerFactory.setKeyPressedInputHandlers(setAllKeyPressedInputHandler());
		inputEventHandlerFactory.setKeyReleasedInputHandlers(setAllKeyReleasedInputHandler());
		inputEventHandlerFactory.setMouseMovedInputHandlers(setAllMouseMovedInputHandler());
		inputEventHandlerFactory.setMousePressedInputHandlers(setAllMousePressedInputHandler());
		inputEventHandlerFactory.setMouseReleasedInputHandlers(setAllMouseReleasedInputHandler());
		inputEventHandlerFactory.setMouseScrolledInputHandlers(setAllMouseScrolledInputHandler());
	}

}
