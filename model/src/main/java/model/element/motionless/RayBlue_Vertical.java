package model.element.motionless;

import model.Permeability;
import model.Sprite;

public class RayBlue_Vertical extends MotionlessElement{
	
	private final static Sprite Ray = new Sprite(' ',"blueray_vertical");

	public RayBlue_Vertical(){
		super(Ray , Permeability.RAY);
	}
}
