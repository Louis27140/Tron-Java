package view;

import static org.junit.Assert.*;

import java.awt.Rectangle;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import controller.IOrderPerformer;
import model.ILevel;
import model.IMobile;

public class ViewFacadeTest {
	
	private ILevel level;
	
	private IMobile playerBlue;
	
	private IMobile playerRed;
	
	private ViewFacade view;
	
	private Rectangle fullView;

	@Before
	public void setUp() throws Exception {
		level = new LevelMock();
		playerBlue = new PlayerBlueMock();
		playerRed = new PlayerRedMock();
		
		fullView = new Rectangle(0, 0, level.getWidth(), level.getHeight());
		
		view = new ViewFacade(level, playerBlue, playerRed);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetLevel() {
		assertEquals(this.level, this.view.getLevel());
}
	
	@Test
	public void testSetLevel() throws IOException {
		final ILevel expected = new LevelMock();
		this.view.setLevel(expected);
		assertEquals(expected, this.view.getLevel());
}
	
	@Test
	public void testGetPlayerBlue() {
		assertEquals(this.playerBlue, this.view.getPlayerBlue());
}
	
	@Test
	public void testGetPlayerRed() {
		assertEquals(this.playerRed, this.view.getPlayerRed());
}
	
	@Test
	public void testSetPlayerBlue() {
		final IMobile expected = new PlayerBlueMock();
		this.view.setPlayerBlue(expected);
		assertEquals(expected, this.view.getPlayerBlue());
}
	
	@Test
	public void testSetPlayerRed() {
		final IMobile expected = new PlayerRedMock();
		this.view.setPlayerRed(expected);
		assertEquals(expected, this.view.getPlayerRed());
}
	
	@Test
	public void testSetOrderPerformer() {
		IOrderPerformer orderPerformer = new ControllerFacadeMock();
		this.view.setOrderPerformer(orderPerformer);
		assertEquals(orderPerformer, this.view.getOrderPerformer());
}
	
	@Test
	public void testGetFullView() {
		assertEquals(this.fullView, this.view.getFullView());
}
	
	@Test
	public void testSetFullView() {
		final Rectangle expected = new Rectangle(0, 0, level.getWidth(), level.getHeight());
		this.view.setFullView(expected);
		assertEquals(expected, this.view.getFullView());
}
	
}