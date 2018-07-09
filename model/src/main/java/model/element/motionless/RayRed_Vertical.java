package model.element.motionless;

import model.Permeability;
import model.Sprite;

/**
 * 
 *  <h1> RayRed Vertical <h1>
 * 
 * @author louis
 * @version 1.0
 */

public class RayRed_Vertical extends MotionlessElement{
	private final static Sprite Ray = new Sprite(' ',"redray_vertical");

	public RayRed_Vertical(){
		super(Ray , Permeability.RAY);
	}
}
