package GameState;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import Main.GamePanel;

public class HelpState extends GameState {

	public HelpState(GameStateManager gsm) {
		this.gsm = gsm;
	}

	public void draw(Graphics2D g) {

		g.setColor(Color.black);
		g.fillRect(0, 0, GamePanel.WIDTH, GamePanel.HEIGHT);

		g.setColor(Color.white);
		g.setFont(new Font("Arial", Font.PLAIN, 72));
		g.drawString("Help", GamePanel.WIDTH / 2 - 75, 100);

	}

	public void init() {

	}

	public void keyPressed(int k) {
	}

	public void keyReleased(int k) {
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
