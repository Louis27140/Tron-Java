package model.element.motionless;

import model.Permeability;
import model.Sprite;
import model.element.Element;
/**
 *  <h1> MotionlessElement <1>
 * 
 * @author louis
 * @version 1.0
 *
 */
abstract class MotionlessElement extends Element {

	/**
     * Instantiates a new motionless element.
     *
     * @param sprite
     *            the sprite
     * @param permeability
     *            the permeability
     */
    MotionlessElement(final Sprite sprite, final Permeability permeability) {
        super(sprite, permeability);
    }
}