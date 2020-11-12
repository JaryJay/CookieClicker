package specifics.bundle.visuals.displayer;

import bundle.visuals.displayer.Displayer;
import bundle.visuals.renderer.GameRenderer;
import common.coordinates.PixelCoordinates;
import specifics.bundle.visuals.displayable.InverseKinematics;

public class InverseKinematicsDisplayer extends Displayer<InverseKinematics> {

	public InverseKinematicsDisplayer(GameRenderer renderer) {
		super(renderer);
	}

	@Override
	public void display(InverseKinematics displayable) {
		PixelCoordinates center = displayable.getCenter();
		PixelCoordinates joint = displayable.getJoint();
		PixelCoordinates endPoint = displayable.getEndPoint();
//		renderer.fill(180, 180, 160);
//		renderer.drawCircle(center.x, center.y, displayable.getArmLength() + displayable.getForeArmLength());
		renderer.fill(0);
		renderer.drawLine(center.x, center.y, joint.x, joint.y);
		renderer.drawLine(joint.x, joint.y, endPoint.x, endPoint.y);
	}

}
