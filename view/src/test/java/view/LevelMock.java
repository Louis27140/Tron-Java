package view;

import java.awt.Point;

import java.util.Observable;

import model.IElement;
import model.ILevel;

public class LevelMock implements ILevel {

	/**
	 * 
	 * Gets Width of window
	 * 
	 * @return int
	 * 
	 */
	@Override
	public int getWidth() {
		// TODO Autogenerated method stub
		return 0;
	}
	
	/**
	 * Gets height of window
	 * 
	 * @return int
	 * 
	 */
	@Override
	public int getHeight() {
		// TODO Autogenerated method stub
		return 0;
	}

	/**
	 * Gets on Level
	 * 
	 * @param x
	 * @param y
	 * 
	 * @return IElement
	 */
	@Override
	public IElement getOnTheLevelXY(int x, int y) {
		// TODO Autogenerated method stub
		return null;
	}

	/**
	 * Set on Level
	 * 
	 * @param x
	 * @param y
	 * @param element
	 */
	@Override
	public void setOnTheLevelXY(int x, int y, IElement element) {
		// TODO Autogenerated method stub

	}

	/**
	 * Gets Observable
	 * 
	 * @return observable
	 */
	@Override
	public Observable getObservable() {
		// TODO Autogenerated method stub
		return null;
	}

	/**
	 * Set element has changed 
	 */
	@Override
	public void setElementHasChanged() {
		// TODO Autogenerated method stub

	}

	/**
	 * Gets Player Blue Position
	 * 
	 * @return Point
	 */
	@Override
	public Point getPlayerBluePosition() {
		// TODO Autogenerated method stub
		return null;
	}

	/**
	 * Gets Player Blue Position
	 * 
	 * @return Point
	 */
	@Override
	public Point getPlayerRedPosition() {
		// TODO Autogenerated method stub
		return null;
	}

	/**
	 * Send information in the DB
	 * 
	 * @param Winner
	 * @param Loser
	 * @param Time
	 */
	@Override
	public void RecordPartie(String Winner, String Loser, int Time) {
		// TODO Auto-generated method stub
		
	}

}