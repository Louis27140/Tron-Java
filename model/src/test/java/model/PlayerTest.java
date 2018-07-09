package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.element.mobile.PlayerBlue;
import model.element.mobile.PlayerRed;

public class PlayerTest {
	
	private PlayerBlue playerBlue;
	
	private ILevel level;

	@Before
	public void setUp() throws Exception {
		this.level = new Level(1);
		this.playerBlue = new PlayerBlue(5,5,level);
	}
	
	/** Tests the moveLeft method */
	@Test
	public void testMoveLeft() {
		this.playerBlue.moveLeft();
		assertEquals(4, this.playerBlue.getX());
	}
	
	/** Tests the moveRight method */
	@Test
	public void testMoveRight() {
		this.playerBlue.moveRight();
		assertEquals(6, this.playerBlue.getX());
	}
	
	/** Tests the moveUp method */
	@Test
	public void testMoveUp() {
		this.playerBlue.moveUp();
		assertEquals(4, this.playerBlue.getY());
	}
	
	/** Tests the moveDown method */
	@Test
	public void testMoveDown() {
		this.playerBlue.moveDown();
		assertEquals(6, this.playerBlue.getY());
	}
	
	/** Tests the isAlive method */
	@Test
	public void testIsAlive() {
		assertEquals(true, this.playerBlue.isAlive());
}

}
