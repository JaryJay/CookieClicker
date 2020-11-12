package bundle.visuals.displayable;

import bundle.visuals.texture.ProcessingTexture;
import common.coordinates.HasDimensionsAndCoordinates;
import common.coordinates.PixelCoordinates;

public class ProcessingTexturedRectangle implements Displayable, HasDimensionsAndCoordinates {

	private PixelCoordinates coordinates;
	private PixelCoordinates dimensions;
	private ProcessingTexture texture;

	public ProcessingTexturedRectangle(PixelCoordinates coordinates, PixelCoordinates dimensions,
			ProcessingTexture texture) {
		this.coordinates = coordinates;
		this.dimensions = dimensions;
		this.setTexture(texture);
	}

	public ProcessingTexture getTexture() {
		return texture;
	}

	public void setTexture(ProcessingTexture texture) {
		this.texture = texture;
	}

	@Override
	public PixelCoordinates getCoordinates() {
		return coordinates;
	}

	@Override
	public void setCoordinates(PixelCoordinates coordinates) {
		this.coordinates = coordinates;
	}

	@Override
	public PixelCoordinates getDimensions() {
		return dimensions;
	}

	@Override
	public void setDimensions(PixelCoordinates dimensions) {
		this.dimensions = dimensions;
	}

}