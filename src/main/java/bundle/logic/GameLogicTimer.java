package bundle.logic;

public class GameLogicTimer implements Runnable {

	private GameLogic gameLogic;
	private boolean isDone = false;

	public GameLogicTimer(GameLogic gameLogic) {
		this.gameLogic = gameLogic;
	}

	@Override
	public void run() {
		while (!isDone) {
			gameLogic.update();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void end() {
		isDone = true;
	}

}
