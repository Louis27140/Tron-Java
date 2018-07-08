package model.element.motionless;

import model.Permeability;
import model.Sprite;


public class RayBlue_Horizontal extends MotionlessElement{
	
	private final static Sprite Ray = new Sprite(' ',"blueray_horizontal");

	public RayBlue_Horizontal(){
		super(Ray , Permeability.RAY);
	}
}
