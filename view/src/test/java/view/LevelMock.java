package view;

import java.awt.Point;
import java.util.Observable;

import model.IElement;
import model.ILevel;

public class LevelMock implements ILevel {

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IElement getOnTheLevelXY(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setOnTheLevelXY(int x, int y, IElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	public Observable getObservable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setElementHasChanged() {
		// TODO Auto-generated method stub

	}

	@Override
	public Point getPlayerBluePosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Point getPlayerRedPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void recordPartie(String Winner, String Loser, int Time) {
		// TODO Auto-generated method stub

	}

}
