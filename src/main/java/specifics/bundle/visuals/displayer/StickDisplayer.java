package specifics.bundle.visuals.displayer;

import bundle.visuals.displayer.Displayer;
import bundle.visuals.renderer.GameRenderer;
import common.coordinates.PixelCoordinates;
import specifics.bundle.visuals.displayable.Stick;

public class StickDisplayer extends Displayer<Stick> {

	public StickDisplayer(GameRenderer renderer) {
		super(renderer);
	}

	@Override
	public void display(Stick displayable) {
		PixelCoordinates center = displayable.getCenter();
		PixelCoordinates endPoint = displayable.getEndPoint();
		renderer.drawLine(center.x, center.y, endPoint.x, endPoint.y);
	}

}
