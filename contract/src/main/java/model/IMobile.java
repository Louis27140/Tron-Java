package model;

import java.awt.Point;

import showboard.IPawn;

/**
 * <h1>The Interface IMobile.</h1>
 *
 * 
 * @author Louis CHOCHOY
 * @version 1.0
 */
public interface IMobile extends IElement, IPawn{
	
	void moveUp();
	
	void moveLeft();
	
	void moveDown();
	
	void moveRight();
	
	/**
	 * 
	 * get value of X on the axis
	 * 
	 * @return int
	 */
	int getX();
	
	/**
	 * 
	 * get value of Y on the axis
	 * 
	 * @return int
	 */
	int getY();
	
	/**
	 * 
	 * player is Alive ?
	 * 
	 * @return boolean
	 */
	boolean isAlive();
	
	/**
	 * 
	 * player has hit a ray ?
	 * 
	 * @param newX
	 * @param newY
	 * @return boolean
	 */
	boolean isHit(int newX, int newY);
	
	/**
	 * 
	 * get position of the player
	 * 
	 * @return point
	 */
	Point getPosition();
	
	void setOrientation(int orientation);
	
	/**
	 * 
	 * get Orientation of the players
	 * 
	 * @return int
	 */
	int getOrientation();
	
	/**
	 * 
	 * player has wall on the path ?
	 * 
	 * @param newX
	 * @param newY
	 * @return boolean
	 */
	boolean isOnWall(int newX, int newY);
	
	void die();
	
}
