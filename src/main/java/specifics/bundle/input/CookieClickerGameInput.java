package specifics.bundle.input;

import java.util.ArrayList;

import bundle.input.GameInput;
import bundle.input.eventhandler.KeyPressedInputEventHandler;
import bundle.input.eventhandler.KeyReleasedInputEventHandler;
import bundle.input.eventhandler.MouseMovedInputEventHandler;
import bundle.input.eventhandler.MousePressedInputEventHandler;
import bundle.input.eventhandler.MouseReleasedInputEventHandler;
import bundle.input.eventhandler.MouseScrolledInputEventHandler;
import specifics.bundle.data.CookieClickerGameData;
import specifics.bundle.visuals.displayable.InverseKinematics;

public class CookieClickerGameInput extends GameInput {

	@Override
	protected ArrayList<KeyPressedInputEventHandler> setKeyPressedInputHandler() {
		return null;
	}

	@Override
	protected ArrayList<KeyReleasedInputEventHandler> setKeyReleasedInputHandler() {
		return null;
	}

	@Override
	protected ArrayList<MouseMovedInputEventHandler> setMouseMovedInputHandler() {
		ArrayList<MouseMovedInputEventHandler> mouseMovedInputEventHandlers = new ArrayList<>();
//		mouseMovedInputEventHandlers.add((event) -> {
//			Stick stick = ((CookieClickerGameData) getBundle().getData()).getStick();
//			Vector2f center = stick.getCenter().toVector();
//			Vector2f mouse = new Vector2f(event.getMouseX(), event.getMouseY());
//			Vector2f centerToMouse = mouse.subtract(center);
//			centerToMouse.normalize();
//			centerToMouse.scale(stick.getLength());
//			stick.setEndPoint(stick.getCenter().toVector().add(centerToMouse).toPixelCoordinates());
//			return false;
//		});
		mouseMovedInputEventHandlers.add((event) -> {
			InverseKinematics inverseKinematics = ((CookieClickerGameData) getBundle().getData())
					.getInverseKinematics();
			inverseKinematics.setEndPoint(event.getMouseCoords().toPixelCoordinates());
			return false;
		});
		mouseMovedInputEventHandlers.add((event) -> {
			InverseKinematics inverseKinematics2 = ((CookieClickerGameData) getBundle().getData())
					.getInverseKinematics2();
			inverseKinematics2.setEndPoint(event.getMouseCoords().toPixelCoordinates());
			return false;
		});
		return mouseMovedInputEventHandlers;
	}

	@Override
	protected ArrayList<MousePressedInputEventHandler> setMousePressedInputHandler() {
		return null;
	}

	@Override
	protected ArrayList<MouseReleasedInputEventHandler> setMouseReleasedInputHandler() {
		return null;
	}

	@Override
	protected ArrayList<MouseScrolledInputEventHandler> setMouseScrolledInputHandler() {
		return null;
	}

}
