package GameState;

import java.awt.Color;
import java.awt.Graphics2D;

import Main.GamePanel;

public class DeadState extends GameState {

	
	public DeadState(GameStateManager gsm) {
		this.gsm = gsm;
	}
	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void draw(Graphics2D g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, GamePanel.WIDTH, GamePanel.HEIGHT);

	}

	@Override
	public void keyPressed(int k) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(int k) {
		// TODO Auto-generated method stub

	}

}
