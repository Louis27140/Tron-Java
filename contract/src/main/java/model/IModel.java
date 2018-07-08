package model;

/**
 * <h1>The Interface IModel.</h1>
 *
 * 
 * @author Louis CHOCHOY
 * @version 1.0
 */
public interface IModel {

	ILevel getLevel();
	
	void setLevelID(int levelID);
	
	int getLevelID();
	
	boolean hasPlayerBlueWon();

	IMobile getPlayerBlue();
	
	IMobile getPlayerRed();

	boolean hasPlayerRedWon();
}
