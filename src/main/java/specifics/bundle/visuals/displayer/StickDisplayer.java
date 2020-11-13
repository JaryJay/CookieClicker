package specifics.bundle.visuals.displayer;

import bundle.visuals.displayer.AbstractDisplayer;
import bundle.visuals.renderer.AbstractGameRenderer;
import common.coordinates.PixelCoordinates;
import specifics.bundle.visuals.displayable.Stick;

public class StickDisplayer extends AbstractDisplayer<Stick> {

	public StickDisplayer(AbstractGameRenderer renderer) {
		super(renderer);
	}

	@Override
	public void display(Stick displayable) {
		PixelCoordinates center = displayable.getCenter();
		PixelCoordinates endPoint = displayable.getEndPoint();
		renderer.drawLine(center.x, center.y, endPoint.x, endPoint.y);
	}

}
