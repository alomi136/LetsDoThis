package GameState;

import java.util.ArrayList;

public class GameStateManager {

	private ArrayList<GameState> gameStates;
	private int currentState;

	public static final int MENUSTATE = 0;	
	public static final int HELPSTATE = 1;
	public static final int PLAYSTATE = 2;
	
	public static final int PAUSESTATE = 3;
	public static final int DEADSTATE = 4;

	public GameStateManager() {

		gameStates = new ArrayList<GameState>();

		currentState = MENUSTATE;
		
		gameStates.add(new MenuState(this));
		gameStates.add(new HelpState(this));
		gameStates.add(new PlayState(this));
		gameStates.add(new PauseState(this));
		gameStates.add(new DeadState(this));

	}

	public void setState(int state) {
		currentState = state;
		gameStates.get(currentState).init();
	}

	public void update() {
		gameStates.get(currentState).update();
	}

	public void draw(java.awt.Graphics2D g) {
		gameStates.get(currentState).draw(g);
	}

	public void keyPressed(int k) {
		gameStates.get(currentState).keyPressed(k);
	}

	public void keyReleased(int k) {
		gameStates.get(currentState).keyReleased(k);
	}

}
