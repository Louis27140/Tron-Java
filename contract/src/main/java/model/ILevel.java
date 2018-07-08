package model;

import java.awt.Point;
import java.util.Observable;

public interface ILevel {
	

	int getWidth();
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
	Point getPlayerBluePosition();
	Point getPlayerRedPosition();
	void recordPartie(final String Winner,final String Loser , final int Time);
	

}
