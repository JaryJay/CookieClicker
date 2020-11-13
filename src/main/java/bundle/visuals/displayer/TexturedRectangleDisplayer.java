package bundle.visuals.displayer;

import bundle.visuals.displayable.ProcessingTexturedRectangle;
import bundle.visuals.renderer.AbstractGameRenderer;
import common.coordinates.PixelCoordinates;

public class TexturedRectangleDisplayer extends AbstractDisplayer<ProcessingTexturedRectangle> {

	public TexturedRectangleDisplayer(AbstractGameRenderer renderer) {
		super(renderer);
	}

	@Override
	public void display(ProcessingTexturedRectangle displayable) {
		PixelCoordinates coordinates = displayable.getCoordinates();
		PixelCoordinates dimensions = displayable.getDimensions();
		renderer.drawTexture(displayable.getTexture(), coordinates.x, coordinates.y, dimensions.x, dimensions.y);
	}

}
