package model.element.motionless;

/**
 *  <h1> MotionlessElementFactory <1>
 * 
 * @author louis
 * @version 1.0
 *
 */

public abstract class MotionlessElementFactory {
	
	private static final Grid	grid	= new Grid();
	
	private static final HorizontalWall horizontalwall 	= new HorizontalWall();
	
	private static final VerticalWall   verticalwall   	= new VerticalWall();
	
	private static final RayBlue_Horizontal	rayBlue_Horizontal	= new RayBlue_Horizontal();
	
	private static final RayBlue_Vertical	rayBlue_Vertical	= new RayBlue_Vertical();
	
	private static final RayRed_Horizontal	rayRed_Horizontal	= new RayRed_Horizontal();
	
	private static final RayRed_Vertical rayRed_Vertical	= new RayRed_Vertical();
	
	private static MotionlessElement[] 	motionlessElements = {
			grid,
			horizontalwall,
			verticalwall,
			rayBlue_Horizontal,
			rayRed_Horizontal
	};
	
	/**
	 * Creates the grid.
	 * @return grid
	 */
	public static MotionlessElement createFloor() {
		return grid;
	}
	
	/**
	 * Creates the horizontal wall.
	 * @return horizontalwall
	 */
	public static MotionlessElement createHorizontalWall() {
		return horizontalwall;
	}
	
	/**
	 * Creates the vertical wall.
	 * @return verticalwall
	 */
	public static MotionlessElement createVerticalWall() {
		return verticalwall;
	}
	
	/**
	 * Creates the Ray Blue.
	 * @return rayBlue
	 */
	public static MotionlessElement createRayBlueHorizontal() {
		return rayBlue_Horizontal;
	}
	
	/**
	 * Creates the Ray Blue.
	 * @return rayBlue
	 */
	public static MotionlessElement createRayBlueVertical() {
		return rayBlue_Vertical;
	}
	
	/**
	 * Creates the Ray Red.
	 * @return rayRed
	 */
	public static MotionlessElement createRayRedHorizontal() {
		return rayRed_Horizontal;
	}
	
	/**
	 * Creates the Ray Red.
	 * @return rayRed
	 */
	public static MotionlessElement createRayRedVertical() {
		return rayRed_Vertical;
	}
	
	/**
     * Gets the right MotionlessElement from file symbol.
     *
     * @param fileSymbol
     *            the file symbol
     * @return floor
     * 		the floor from file symbol
     */
    public static MotionlessElement getFromFileSymbol(final char fileSymbol) {
        for (final MotionlessElement motionlessElement : motionlessElements) {
            if (motionlessElement.getSprite().getConsoleImage() == fileSymbol) {
                return motionlessElement;
            }
        }
        return grid;
    }
}
