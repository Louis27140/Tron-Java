package model.element.motionless;

import model.Permeability;
import model.Sprite;

/**
 * 
 *  <h1> Wall Horizontal <h1>
 * 
 * @author louis
 * @version 1.0
 */
public class VerticalWall extends MotionlessElement{

	/** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('1', "Wall_Vertical");
    
	VerticalWall() {
		super(SPRITE, Permeability.BLOCKING);
	}

}
