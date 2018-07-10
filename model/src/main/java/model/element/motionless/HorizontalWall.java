package model.element.motionless;

import model.Permeability;
import model.Sprite;
/**
 *  <h1> The Horizontal Wall <1>
 * 
 * @author louis
 * @version 1.0
 *
 */
public class HorizontalWall extends MotionlessElement{

	/** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('2', "Wall_Horizontal");
    
	HorizontalWall() {
		super(SPRITE, Permeability.BLOCKING);
	}

}
