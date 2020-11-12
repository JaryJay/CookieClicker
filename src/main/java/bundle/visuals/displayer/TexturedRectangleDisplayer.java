package bundle.visuals.displayer;

import bundle.visuals.displayable.ProcessingTexturedRectangle;
import bundle.visuals.renderer.GameRenderer;
import common.coordinates.PixelCoordinates;

public class TexturedRectangleDisplayer extends Displayer<ProcessingTexturedRectangle> {

	public TexturedRectangleDisplayer(GameRenderer renderer) {
		super(renderer);
	}

	@Override
	public void display(ProcessingTexturedRectangle displayable) {
		PixelCoordinates coordinates = displayable.getCoordinates();
		PixelCoordinates dimensions = displayable.getDimensions();
		renderer.drawTexture(displayable.getTexture(), coordinates.x, coordinates.y, dimensions.x, dimensions.y);
	}

}
