package bundle.visuals.displayer;

import bundle.visuals.displayer.renderer.GameRenderer;

public class DisplayerFactory {
	
	public void display(Displayer displayer, GameRenderer renderer) {
		displayer.display(renderer);
	}
	
}
