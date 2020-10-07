package bundle.logic;

import bundle.GameBundleWrapper;

public class GameLogicTimer implements Runnable {

	private GameLogic gameLogic;
	private GameBundleWrapper bundleWrapper;

	private boolean isDone = false;

	private long framesElapsed = 1;
	private float targetFrameRate = 10f;
	private float targetFrameTime = 1000.0f / targetFrameRate;
	private Float accumulator = new Float(0);

	private long currentTime;

	public GameLogicTimer(GameBundleWrapper bundleWrapper) {
		this.bundleWrapper = bundleWrapper;
		this.gameLogic = bundleWrapper.getBundle().getLogic();
	}

	@Override
	public void run() {
		while (!isDone) {
			fixedTimeStepUpdate();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void fixedTimeStepUpdate() {
		currentTime = System.currentTimeMillis();
		while (!isDone) {
			long newTime = System.currentTimeMillis();
			long frameTime = newTime - currentTime;

			// The following if check is to make sure we don't fall into the spiral of death
			if (frameTime >= 1000) {
				frameTime = 1000;
			}
			currentTime = newTime;
			accumulator += frameTime;
			GameLogic gameLogic = bundleWrapper.getBundle().getLogic();

			// Updating as many times as needed to make up for any lag
			while (accumulator >= targetFrameTime) {
				gameLogic.update();
				accumulator -= targetFrameTime;
				framesElapsed++;
			}

			// Yielding thread in case other threads need a chance to shine
			Thread.yield();
		}
	}

	public void end() {
		isDone = true;
	}

}
