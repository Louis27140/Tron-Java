package model.element.mobile;

import java.io.IOException;

import model.ILevel;
import model.Permeability;
import model.Sprite;
import model.element.motionless.MotionlessElementFactory;


public class PlayerBlue extends Mobile{
	
	private static Sprite bluemoto_b = new Sprite(' ', "bluemoto_b");
	private static Sprite bluemoto_l = new Sprite(' ' ,"bluemoto_l");
	private static Sprite bluemoto_r = new Sprite(' ' ,"bluemoto_r");
	private static Sprite bluemoto_u = new Sprite(' ' ,"bluemoto_u");
	
	private boolean won = false;
	
	public PlayerBlue(int x, int y, ILevel level) throws IOException {
		super(bluemoto_u, Permeability.BLOCKING, level);
		
		//bluemoto_u.loadImage();
		//bluemoto_r.loadImage();
		//bluemoto_b.loadImage();
		//bluemoto_l.loadImage();
		
		this.initX(x);
		this.initY(y);
	}
	
	public void specialCase(int x, int y) {
		if(isHit(x, y) || isOnWall(x,y)) {this.die();}
	}
	
	@Override
	public void moveLeft() {
		this.getLevel().setOnTheLevelXY(this.getX(), this.getY(), MotionlessElementFactory.createRayBlueHorizontal());
		super.moveLeft();
		specialCase(this.getX(), this.getY());
		this.setSprite(bluemoto_l);
		this.setHasMoved();
	}
	
	@Override
	public void moveUp() {
		this.getLevel().setOnTheLevelXY(this.getX(), this.getY(), MotionlessElementFactory.createRayBlueVertical());
		super.moveUp();
		specialCase(this.getX(), this.getY());
		this.setSprite(bluemoto_u);
		this.setHasMoved();
	}
	
	@Override
	public void moveDown(){
		this.getLevel().setOnTheLevelXY(this.getX(), this.getY(), MotionlessElementFactory.createRayBlueVertical());
		super.moveDown();
		specialCase(this.getX(), this.getY());
		this.setSprite(bluemoto_b);
		this.setHasMoved();
	}
	
	@Override
	public void moveRight() {
		this.getLevel().setOnTheLevelXY(this.getX(), this.getY(), MotionlessElementFactory.createRayBlueHorizontal());
		super.moveRight();
		specialCase(this.getX(), this.getY());
		this.setSprite(bluemoto_r);
		this.setHasMoved();
	}
	
	public boolean hasWon() {
		return this.won;
	}

	@Override
	public void doNothing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void shoot() {
		// TODO Auto-generated method stub
		
	}
}
