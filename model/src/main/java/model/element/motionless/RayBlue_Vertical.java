package model.element.motionless;

import model.Permeability;
import model.Sprite;

/**
 * 
 *  <h1> RayBlue Vertical <h1>
 * 
 * @author louis
 * @version 1.0
 */
public class RayBlue_Vertical extends MotionlessElement{
	
	private final static Sprite Ray = new Sprite(' ',"blueray_vertical");

	public RayBlue_Vertical(){
		super(Ray , Permeability.RAY);
	}
}
