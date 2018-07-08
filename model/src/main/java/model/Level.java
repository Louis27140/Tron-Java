package model;

import java.awt.Point;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Observable;

import model.dao.TronDAO;

import model.element.motionless.MotionlessElementFactory;
/**
 * <h1>The Level Class</h1>
 * 
 * 
 * @author Louis CHOCHOY
 */
public class Level extends Observable implements ILevel {
	
	private final int width = 20;
	private final int height = 12;
	
	private IElement[][] onTheLevel;
	
	private Point playerBluePosition;
	
	private Point playerRedPosition;
	
	public Level(int level) {
		super();
		
		try {
			this.loadLevel(level);
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Gets the width.
	 * 
	 * @return the width
	 */
	@Override
	public int getWidth() {
		return this.width;
	}

	/**
	 * Gets the Height.
	 * @return the height
	 */
	@Override
	public int getHeight() {
		return this.height;
	}

	@Override
	public IElement getOnTheLevelXY(int x, int y) {
		return onTheLevel[x][y];
	}
	
	@Override
	public void setOnTheLevelXY(int x, int y, IElement element) {
		this.onTheLevel[x][y] = element;
	}

	@Override
	public Observable getObservable() {
		return this;
	}

	@Override
	public void setElementHasChanged() {
		this.setChanged();
		this.notifyObservers();

	}
	/**
	 * <h1>The loadLevel method.</h1>
	 * 
	 * This method reads the levelText and processes it to generate the maps.
	 * <p>
	 * 
	 * The algorithm consists in two imbricate "for" loops browsing the height and width. 
	 * <br> Inside is a "switch" condition calling the creation of the right item depending on the text input.
	 * 
	 * @param level
	 * @throws SQLException
	 * @throws IOException
	 */
	private void loadLevel(int level) throws SQLException, IOException {
		String levelText = TronDAO.chooseLevel(level);
		this.onTheLevel = new IElement[this.getWidth()][this.getHeight()];
		String[] levelArray = levelText.split("\n");
		
		for(int y = 0; y < height; y++) {
			for(int x = 0; x < width; x++) {
				switch(levelArray[y].toCharArray()[x]) {
					case '3':
						this.setPlayerBluePosition(new Point(x, y));
						this.setOnTheLevelXY(x, y, MotionlessElementFactory.createFloor());
						break;
					case '4':
						this.setPlayerRedPosition(new Point(x, y));
						this.setOnTheLevelXY(x, y, MotionlessElementFactory.createFloor());
						break;
					default: 
						this.setOnTheLevelXY(x, y, MotionlessElementFactory.getFromFileSymbol(levelArray[y].toCharArray()[x]));
						break;
				}
			}
		}
		
	}
	/**
	 * Gets the character position
	 * @return getplayerBluePosition
	 */
	public Point getPlayerBluePosition() {
		return this.playerBluePosition;
	}
	/**
	 * Sets the character position
	 * @param position
	 */
	private void setPlayerBluePosition(Point position) {
		this.playerBluePosition = position;
	}

	public Point getPlayerRedPosition() {
		return playerRedPosition;
	}

	private void setPlayerRedPosition(Point position) {
		this.playerRedPosition = position;
	}
	
	public void RecordPartie(final String Winner , final String Loser , final int Time) {
		try {
			TronDAO.RecordPartie(Winner, Loser, Time);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void recordPartie(String Winner, String Loser, int Time) {
		// TODO Auto-generated method stub
		
	}
}
