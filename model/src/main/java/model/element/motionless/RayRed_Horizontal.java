package model.element.motionless;

import model.Permeability;
import model.Sprite;

/**
 * 
 *  <h1> RayRed Horizontal <h1>
 * 
 * @author louis
 * @version 1.0
 */
public class RayRed_Horizontal extends MotionlessElement{
	private final static Sprite Ray = new Sprite(' ',"redray_horizontal");

	public RayRed_Horizontal(){
		super(Ray , Permeability.RAY);
	}
}
