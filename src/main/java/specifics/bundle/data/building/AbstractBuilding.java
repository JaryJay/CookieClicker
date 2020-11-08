package specifics.bundle.data.building;

public abstract class AbstractBuilding {

	private String name;
	private boolean moving;
	private long cps;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isMoving() {
		return moving;
	}

	public void setMoving(boolean moving) {
		this.moving = moving;
	}

	public long getCps() {
		return cps;
	}

	public void setCps(long cps) {
		this.cps = cps;
	}

}
