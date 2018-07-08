package model.element.motionless;

import model.Permeability;
import model.Sprite;

public class RayRed_Vertical extends MotionlessElement{
	private final static Sprite Ray = new Sprite(' ',"redray_vertical");

	public RayRed_Vertical(){
		super(Ray , Permeability.RAY);
	}
}
