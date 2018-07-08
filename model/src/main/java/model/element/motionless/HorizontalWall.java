package model.element.motionless;

import model.Permeability;
import model.Sprite;

public class HorizontalWall extends MotionlessElement{

	/** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('2', "blueray_horizontal");
    
	HorizontalWall() {
		super(SPRITE, Permeability.BLOCKING);
	}

}
