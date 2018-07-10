package main;

import java.io.IOException;
import java.sql.SQLException;

import controller.ControllerFacade;
import controller.IController;
import model.IModel;
import model.ModelFacade;
import view.ViewFacade;

/**
 * <h1>The Class Main.</h1>
 *
 * 
 * @author Louis CHOCHOY
 * @version 1.0
 */
public abstract class Main {

    /**
     * The main method
     *
     * @param args
     *            the arguments
     * @throws InterruptedException 
     * @throws IOException 
     * @throws SQLException 
     */
    public static void main(final String[] args) throws InterruptedException, IOException, SQLException {

    	final IModel model = new ModelFacade(1);
    	final ViewFacade view = new ViewFacade(model.getLevel(), model.getPlayerBlue(), model.getPlayerRed());
        final IController controller = new ControllerFacade(view, model);
        
        view.setOrderPerformer(controller.getOrderPerformer());
        controller.start();
    }
}
