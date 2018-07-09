package model;

import java.awt.Point;
import java.util.Observable;

/**
 * <h1>The Interface ILevel.</h1>
 *
 * 
 * @author Louis CHOCHOY
 * @version 1.0
 */
public interface ILevel {
	
	/**
	 * 
	 * gets width of the window
	 * 
	 * @return int
	 */
	int getWidth();
	
	/**
	 * 
	 * gets height of the window
	 * 
	 * @return int
	 */
	int getHeight();
	
	/**
	 * 
	 * @param x
	 * @param y
	 */
	IElement getOnTheLevelXY(int x, int y);
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param element
	 */
	void setOnTheLevelXY(int x, int y, IElement element);
	
	/**
	 * Gets the observables
	 * 
	 * @return observable
	 */
	Observable getObservable();
	
	void setElementHasChanged();
	
	/**
	 * 
	 * gets position of the player Blue
	 * 
	 * @return point
	 */
	Point getPlayerBluePosition();
	
	/**
	 * 
	 * get position of player red
	 * 
	 * @return point
	 */
	Point getPlayerRedPosition();

	/**
	 * 
	 * record information of the Game.
	 * 
	 * @param Winner
	 * @param Loser
	 * @param Time
	 */
	void RecordPartie(String Winner, String Loser, int Time);
	

}
