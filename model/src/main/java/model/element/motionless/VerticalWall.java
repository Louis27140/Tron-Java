package model.element.motionless;

import model.Permeability;
import model.Sprite;

public class VerticalWall extends MotionlessElement{

	/** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('1', "blueray_vertical");
    
	VerticalWall() {
		super(SPRITE, Permeability.BLOCKING);
	}

}
