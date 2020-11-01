package bundle.input;

import java.util.ArrayList;

import bundle.AbstractBundlePart;
import bundle.input.event.AbstractGameInputEvent;
import bundle.input.eventhandler.AbstractGameInputEventHandler;
import bundle.input.eventhandler.GameInputEventHandlerFactory;
import bundle.input.eventhandler.KeyPressedInputEventHandler;
import bundle.input.eventhandler.KeyReleasedInputEventHandler;
import bundle.input.eventhandler.MouseMovedInputEventHandler;
import bundle.input.eventhandler.MousePressedInputEventHandler;
import bundle.input.eventhandler.MouseReleasedInputEventHandler;
import bundle.input.eventhandler.MouseScrolledInputEventHandler;

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
			handler.handle(inputEvent);
		}
	}

	protected abstract ArrayList<KeyPressedInputEventHandler> setKeyPressedInputHandler();

	protected abstract ArrayList<KeyReleasedInputEventHandler> setKeyReleasedInputHandler();

	protected abstract ArrayList<MouseMovedInputEventHandler> setMouseMovedInputHandler();

	protected abstract ArrayList<MousePressedInputEventHandler> setMousePressedInputHandler();

	protected abstract ArrayList<MouseReleasedInputEventHandler> setMouseReleasedInputHandler();

	protected abstract ArrayList<MouseScrolledInputEventHandler> setMouseScrolledInputHandler();

	public void init() {
		inputBuffer = getBundle().getWrapper().getInputBuffer();
		inputEventHandlerFactory = new GameInputEventHandlerFactory();
		inputEventHandlerFactory.setKeyPressedInputHandlers(setKeyPressedInputHandler());
		inputEventHandlerFactory.setKeyReleasedInputHandlers(setKeyReleasedInputHandler());
		inputEventHandlerFactory.setMouseMovedInputHandlers(setMouseMovedInputHandler());
		inputEventHandlerFactory.setMousePressedInputHandlers(setMousePressedInputHandler());
		inputEventHandlerFactory.setMouseReleasedInputHandlers(setMouseReleasedInputHandler());
		inputEventHandlerFactory.setMouseScrolledInputHandlers(setMouseScrolledInputHandler());
	}

}
