package model;

import java.io.IOException;
import java.sql.SQLException;

import model.element.mobile.PlayerBlue;
import model.element.mobile.PlayerRed;

/**
 * <h1>The Class ModelFacade provides a facade for the Model component.</h1>
 *
 * @author Louis CHOCHOY, Thomas ISAAC, Valentin CASEN and Adrien LALISSE
 * @version 1.0
 */
public final class ModelFacade implements IModel {
	
	private int LevelID;
	
	private ILevel level;
	
	private IMobile playerBlue;
	
	private IMobile playerRed;
	
    /**
     * Instantiates a new model facade.
     * 
     * 
     * @param level
     * @throws SQLException 
     * @throws IOException 
     */
    public ModelFacade(int level) throws SQLException, IOException {
        super();
        this.setLevel(new Level(level));
        this.setPlayerBlue(new PlayerBlue((int)this.level.getPlayerBluePosition().getX(), (int)this.level.getPlayerBluePosition().getY(), this.level));
        this.setPlayerRed(new PlayerRed((int)this.level.getPlayerRedPosition().getX(), (int)this.level.getPlayerRedPosition().getY(), this.level));
    }
    
	@Override
	public ILevel getLevel() {
		return this.level;
	}
/**
 * Gets the playerBlue.
 * @return playerBlue
 */
	@Override
	public IMobile getPlayerBlue() {
		return this.playerBlue;
	}
	/**
	 * Sets the level.
	 * @param level
	 */
	private void setLevel(ILevel level) {
		this.level = level;
	}
	/**
	 * Sets the playerBlue.
	 * @param playerBlue
	 */

	private void setPlayerBlue(IMobile playerBlue) {
		this.playerBlue = playerBlue;
	}

	@Override
	public boolean hasPlayerBlueWon() {
		return ((PlayerBlue)this.getPlayerBlue()).hasWon();
	}
	
	@Override
	public boolean hasPlayerRedWon() {
		return ((PlayerRed)this.getPlayerRed()).hasWon();
	}
	/**
	 * Gets the level ID.
	 * @return LevelID
	 */

	public int getLevelID() {
		return LevelID;
	}
	/**
	 * Sets the level ID
	 * @param levelID
	 */

	public void setLevelID(int levelID) {
		this.LevelID = levelID;
	}

	public IMobile getPlayerRed() {
		return playerRed;
	}

	public void setPlayerRed(IMobile playerRed) {
		this.playerRed = playerRed;
	}
	
}
