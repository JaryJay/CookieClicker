package bundle.logic;

import bundle.GameBundleWrapper;

public class GameLogicTimer implements Runnable {

	private GameBundleWrapper bundleWrapper;

	private boolean isDone = false;

	private long framesElapsed = 1;
	private float targetFrameRate = 10f;
	private float targetFrameTime = 1000.0f / targetFrameRate;
	private Float accumulator = new Float(0);

	private long currentTime;

	public GameLogicTimer(GameBundleWrapper bundleWrapper) {
		this.bundleWrapper = bundleWrapper;
	}

	@Override
	public void run() {
		currentTime = System.currentTimeMillis();
		while (!isDone) {
			// Conditional updates if time is up
			fixedTimeStepUpdate();
			// Yielding thread in case other threads need a chance to shine
			Thread.yield();
		}
	}

	private void fixedTimeStepUpdate() {
		long newTime = System.currentTimeMillis();
		long frameTime = newTime - currentTime;

		// The following if check is to make sure we don't fall into the spiral of death
		if (frameTime >= 1000) {
			frameTime = 1000;
		}
		currentTime = newTime;
		accumulator += frameTime;
		AbstractGameLogic gameLogic = bundleWrapper.getBundle().getLogic();

		// Updating as many times as needed to make up for any lag
		while (accumulator >= targetFrameTime) {
			gameLogic.update();
			accumulator -= targetFrameTime;
			framesElapsed++;
		}
	}

	public void end() {
		isDone = true;
	}

	public long getFramesElapsed() {
		return framesElapsed;
	}

}
