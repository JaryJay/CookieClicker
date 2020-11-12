package common.coordinates;

public interface HasDimensionsAndCoordinates {

	public PixelCoordinates getCoordinates();

	public void setCoordinates(PixelCoordinates coordinates);

	public PixelCoordinates getDimensions();

	public void setDimensions(PixelCoordinates dimensions);

}
