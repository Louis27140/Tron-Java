package model.element.mobile;

import java.io.IOException;

import model.ILevel;
import model.Permeability;
import model.Sprite;
import model.element.motionless.MotionlessElementFactory;

public class PlayerRed extends Mobile{
	
	private static Sprite redmoto_b = new Sprite(' ', "redmoto_b");
	private static Sprite redmoto_l = new Sprite(' ' ,"redmoto_l");
	private static Sprite redmoto_r = new Sprite(' ' ,"redmoto_r");
	private static Sprite redmoto_u = new Sprite(' ' ,"redmoto_u");
	
	private boolean won = false;
	
	public PlayerRed(int x, int y, ILevel level) throws IOException {
		super(redmoto_u, Permeability.BLOCKING, level);
		
		redmoto_u.loadImage();
		redmoto_r.loadImage();
		redmoto_b.loadImage();
		redmoto_l.loadImage();
		
		this.initX(x);
		this.initY(y);
	}
	
	public void specialCase(int x, int y) {
		if(isHit(x, y) || isOnWall(x,y)) {this.die();}
	}
	
	@Override
	public void moveLeft() {
		this.getLevel().setOnTheLevelXY(this.getX(), this.getY(), MotionlessElementFactory.createRayRedHorizontal());
		super.moveLeft();
		specialCase(this.getX(), this.getY());
		this.setSprite(redmoto_l);
		this.setHasMoved();
	}
	
	@Override
	public void moveUp() {
		this.getLevel().setOnTheLevelXY(this.getX(), this.getY(), MotionlessElementFactory.createRayRedVertical());
		super.moveUp();
		specialCase(this.getX(), this.getY());
		this.setSprite(redmoto_u);
		this.setHasMoved();
	}
	
	@Override
	public void moveDown(){
		this.getLevel().setOnTheLevelXY(this.getX(), this.getY(), MotionlessElementFactory.createRayRedVertical());
		super.moveDown();
		specialCase(this.getX(), this.getY());
		this.setSprite(redmoto_b);
		this.setHasMoved();
	}
	
	@Override
	public void moveRight() {
		this.getLevel().setOnTheLevelXY(this.getX(), this.getY(), MotionlessElementFactory.createRayRedHorizontal());
		super.moveRight();
		specialCase(this.getX(), this.getY());
		this.setSprite(redmoto_r);
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
