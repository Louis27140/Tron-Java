package controller;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.SQLException;

import model.IModel;
import view.IView;


/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * 
 * @author Louis CHOCHOY
 * @version 1.0
 */
public class ControllerFacade implements IController, IOrderPerformer {

    /** The view. */
    private final IView  view;

    /** The model. */
    private final IModel model;
    
    /** The order. */
    private KeyEvent stackOrder;
    
    /** The refresh rate. */
    private static int speed = 500;
    
    private int orientation = 1;

    /**
     * Instantiates a new controller facade.
     *
     * @param view
     *            the view
     * @param model
     *            the model
     */
    public ControllerFacade(final IView view, final IModel model) {
        super();
        this.view = view;
        this.model = model;
    }

    /**
     * Start.
     *
     * @throws SQLException
     *             the SQL exception
     * @throws InterruptedException
     * @throws IOException
     */
    public void start() throws SQLException, InterruptedException, IOException {
    	this.getModel().getPlayerBlue().setOrientation(orientation);
    	this.getModel().getPlayerRed().setOrientation(orientation);
        while(this.getModel().getPlayerBlue().isAlive()  && this.getModel().getPlayerRed().isAlive()) {
        	Thread.sleep(speed);
        	
        	int lastXpb = this.getModel().getPlayerBlue().getX();
        	int lastYpb = this.getModel().getPlayerBlue().getY();
        	
        	int lastXpr = this.getModel().getPlayerRed().getX();
        	int lastYpr = this.getModel().getPlayerRed().getY();
        	
        	if(this.getStackOrder() != null) {
        		switch(this.getStackOrder().getKeyCode()) {
        		case KeyEvent.VK_RIGHT:
        			this.getModel().getPlayerBlue().setOrientation(this.getModel().getPlayerBlue().getOrientation() + 1);
        			this.ChangeDirectionPlayerBlue();
        			this.getView().DisplayElement(lastXpb, lastYpb);
        			break;
        		case KeyEvent.VK_LEFT:
        			this.getModel().getPlayerBlue().setOrientation(this.getModel().getPlayerBlue().getOrientation() - 1);
        			this.ChangeDirectionPlayerBlue();
        			this.getView().DisplayElement(lastXpb, lastYpb);
        			break;
        		default:
        			this.ChangeDirectionPlayerBlue();
        			this.getView().DisplayElement(lastXpb, lastYpb);
        			break;
        		}
        		
        		switch(this.getStackOrder().getKeyCode()) {
        		case KeyEvent.VK_Q:
        			this.getModel().getPlayerRed().setOrientation(this.getModel().getPlayerRed().getOrientation() - 1);
        			this.ChangeDirectionPlayerRed();
        			this.getView().DisplayElement(lastXpr, lastYpr);
        			break;
        		case KeyEvent.VK_D:
        			this.getModel().getPlayerRed().setOrientation(this.getModel().getPlayerRed().getOrientation() + 1);
        			this.ChangeDirectionPlayerRed();
        			this.getView().DisplayElement(lastXpr, lastYpr);
        			break;
        		default:
        			this.ChangeDirectionPlayerRed();
        			this.getView().DisplayElement(lastXpr, lastYpr);
        			break;
        		}
        		
        		
        		this.stackOrder = null;
        	}
        	else {
        		this.ChangeDirectionPlayerBlue();
        		this.getView().DisplayElement(lastXpb, lastYpb);
        		this.ChangeDirectionPlayerRed();
        		this.getView().DisplayElement(lastXpr, lastYpr);
        	}
        }
        if(!this.getModel().getPlayerBlue().isAlive() && !this.getModel().getPlayerRed().isAlive()) {
        	this.getView().displayMessage("Tied");
        }
        else if(!this.getModel().getPlayerBlue().isAlive()) {
        	this.getModel().getLevel().recordPartie( "red" , "Blue" , 100 );
        	this.getView().displayMessage("Blue lose / Red Win");
        }
        else if(!this.getModel().getPlayerRed().isAlive()) {
        	this.getModel().getLevel().recordPartie( "Blue" , "Red" , 100 );
        	this.getView().displayMessage("Blue Win / Red Lose");
        }
    }

	public void ChangeDirectionPlayerBlue() {
    	
    	switch(this.getModel().getPlayerBlue().getOrientation()) {
    	case 0:
    		this.getModel().getPlayerBlue().setOrientation(4);
    		this.getModel().getPlayerBlue().moveLeft();
    		break;
    	case 1:
    		this.getModel().getPlayerBlue().moveUp();
    		break;
    	case 2:
    		this.getModel().getPlayerBlue().moveRight();
    		break;
    	case 3:
    		this.getModel().getPlayerBlue().moveDown();
    		break;
    	case 4:
    		this.getModel().getPlayerBlue().moveLeft();
    		break;
    	case 5:
    		this.getModel().getPlayerBlue().setOrientation(1);
    		this.getModel().getPlayerBlue().moveUp();
    		break;
    	}
    }
    
public void ChangeDirectionPlayerRed() {
    	
    	switch(this.getModel().getPlayerRed().getOrientation()) {
    	case 0:
    		this.getModel().getPlayerRed().setOrientation(4);
    		this.getModel().getPlayerRed().moveLeft();
    		break;
    	case 1:
    		this.getModel().getPlayerRed().moveUp();
    		break;
    	case 2:
    		this.getModel().getPlayerRed().moveRight();
    		break;
    	case 3:
    		this.getModel().getPlayerRed().moveDown();
    		break;
    	case 4:
    		this.getModel().getPlayerRed().moveLeft();
    		break;
    	case 5:
    		this.getModel().getPlayerRed().setOrientation(1);
    		this.getModel().getPlayerRed().moveUp();
    		break;
    	}
    }
    
    /**
     * Gets the view.
     *
     * @return the view
     */
    public IView getView() {
        return this.view;
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    public IModel getModel() {
        return this.model;
    }
    
    /**
     * Performs the order.
     *
     *@param userOrder
     */
    public void performOrder(KeyEvent userOrder) {
    	this.setStackOrder(userOrder);
    }

    /**
     * Gets the order.
     *
     * @return the model
     */
	public KeyEvent getStackOrder() {
		return stackOrder;
	}

	/**
     * Sets the stack order.
     *
     * @param stackOrder
     */
	public void setStackOrder(KeyEvent stackOrder) {
		this.stackOrder = stackOrder;
	}
	
	/**
     * Gets the Order performer.
     *
     * @return the model
     */
	public IOrderPerformer getOrderPerformer() {
		return this;
	}
}
