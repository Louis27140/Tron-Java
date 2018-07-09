package model.element.motionless;

import model.Permeability;
import model.Sprite;
/**
 *  <h1> The Grid <1>
 * 
 * @author louis
 * @version 1.0
 *
 */
public class Grid extends MotionlessElement{

	/** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite(' ',"floor");
    
	Grid() {
		super(SPRITE, Permeability.PENETRABLE);
	}
}
