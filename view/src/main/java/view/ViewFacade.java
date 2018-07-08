package view;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.lang.model.element.VariableElement;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import controller.IOrderPerformer;

import showboard.BoardFrame;
import model.IElement;
import model.ILevel;
import model.IMobile;
import model.Sprite;


/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * 
 * @author Louis CHOCHOY
 * @version 1.0
 */
public class ViewFacade implements IView, KeyListener, Runnable {
	
	/** The Level. */
	private ILevel level;
	
	/** The character. */
	private IMobile playerRed;
	
	private IMobile playerBlue;
	
	/** The order performer. */
	private IOrderPerformer orderPerformer;
	
	/** The Constant squareSize. */
    private static final int squareSize = 32;

    /** The Constant fullView. */
    private Rectangle fullView;
    
    BoardFrame boardFrame;

	/**
     * Instantiates a new view facade.
     * 
     * @param level
     * @param playerRed
     * @param playerBlue
     * @throws IOException
     */
    public ViewFacade(ILevel level, IMobile playerblue, IMobile playerred) throws IOException {
        this.setLevel(level);
        this.setPlayerBlue(playerblue);
        this.setPlayerRed(playerred);
        this.getPlayerBlue().getSprite().loadImage();
        this.getPlayerRed().getSprite().loadImage();
        this.setFullView(new Rectangle(0, 0, this.getLevel().getWidth(), this.getLevel().getHeight()));
        SwingUtilities.invokeLater(this);
        
    }

    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null , message);
    }

    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
	@Override
	public void run() {
		boardFrame = new BoardFrame("Tron", false);
		boardFrame.setDimension(new Dimension(this.getLevel().getWidth(), this.getLevel().getHeight()));
        boardFrame.setDisplayFrame(this.fullView);
        boardFrame.setSize(this.fullView.width * squareSize - 32, this.fullView.height * squareSize);
        boardFrame.setHeightLooped(false);
        boardFrame.addKeyListener(this);
        boardFrame.setFocusable(true);
        //boardFrame.setFocusTraversalKeysEnabled(false);
		
		for (int x = 0; x < this.getLevel().getWidth(); x++) {
            for (int y = 0; y < this.getLevel().getHeight(); y++) {
                boardFrame.addSquare(this.level.getOnTheLevelXY(x, y), x, y);
            }
        }
		
		boardFrame.addPawn(this.getPlayerBlue());
		
		boardFrame.addPawn(this.getPlayerBlue());
		
		boardFrame.addPawn(this.getPlayerRed());
		
		// IPawn sprites loading

		boardFrame.addPawn(this.getPlayerRed());

        this.getLevel().getObservable().addObserver(boardFrame.getObserver());

        boardFrame.setVisible(true);
	}

	/*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
	@Override
	public void keyTyped(KeyEvent keyEvent) {
		//NOP
	}

	/*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
	@Override
	public void keyPressed(KeyEvent keyEvent) {
		this.getOrderPerformer().performOrder(keyEvent);
	}

	/*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
	@Override
	public void keyReleased(KeyEvent keyEvent) {
		//NOP
	}

	/**
     * Gets the Level.
     * 
     * @return level
     */

	public ILevel getLevel() {
		return this.level;
	}

	/**
     * Set the Level.
     * 
     * @param level
	 * @throws IOException 
     */

	public void setLevel(ILevel level) throws IOException {
		this.level = level;
		int y = 0;
		int x = 0;
		for (y = 0; y < this.getLevel().getHeight(); y++) {
			for (x = 0; x < this.getLevel().getWidth(); x++) {
				this.getLevel().getOnTheLevelXY(x,y).getSprite().loadImage();
			}
		}
	}
	
	public void DisplayElement(int x,int y) {
		
		try {
			this.getLevel().getOnTheLevelXY(x, y).getSprite().loadImage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boardFrame.addSquare(this.getLevel().getOnTheLevelXY(x, y), x, y);
	}

	/**
     * Gets the Character.
     * @return playerRed
     */
	public IMobile getPlayerRed() {
		return this.playerRed;
	}

	/**
     * Sets the Character.
     * @param playerRed
     */
	public void setPlayerRed(IMobile playerRed) {
		this.playerRed = playerRed;
	}

	public IMobile getPlayerBlue() {
		return playerBlue;
	}

	public void setPlayerBlue(IMobile playerBlue) {
		this.playerBlue = playerBlue;
	}

	/**
     * Gets the OrderPerformer.
     * @return orderPerformer
     */
	public IOrderPerformer getOrderPerformer() {
		return this.orderPerformer;
	}

	/**
     * Sets the OrderPerformer.
     * @param orderPerformer
     */
	public void setOrderPerformer(IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
	}

	/**
     * Gets the full view.
     * @return fullView
     */
	public Rectangle getFullView() {
		return this.fullView;
	}

	/**
     * Sets the full view.
     * @param fullView
     */
	public void setFullView(Rectangle fullView) {
		this.fullView = fullView;
	}
}
