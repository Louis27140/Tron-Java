package model.element.motionless;

import model.Permeability;
import model.Sprite;

/**
 * 
 *  <h1> RayBlue Horizontal <h1>
 * 
 * @author louis
 * @version 1.0
 */
public class RayBlue_Horizontal extends MotionlessElement{
	
	private final static Sprite Ray = new Sprite(' ',"blueray_horizontal");

	public RayBlue_Horizontal(){
		super(Ray , Permeability.RAY);
	}
}
