package model.element.motionless;

import model.Permeability;
import model.Sprite;

public class Grid extends MotionlessElement{

	/** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite(' ',"floor");
    
	Grid() {
		super(SPRITE, Permeability.PENETRABLE);
	}
}
