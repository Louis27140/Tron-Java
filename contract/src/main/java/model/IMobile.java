package model;

import java.awt.Point;

import showboard.IPawn;

public interface IMobile extends IElement, IPawn{
	
	void moveUp();
	void moveLeft();
	void moveDown();
	void moveRight();
	void doNothing();
	int getX();
	int getY();
	boolean isAlive();
	boolean isHit(int newX, int newY);
	Point getPosition();
	void shoot();
	void setOrientation(int orientation);
	int getOrientation();
	boolean isOnWall(int newX, int newY);
	void die();
	
}
