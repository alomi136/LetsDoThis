package GameState;

import java.awt.Color;
import java.awt.Graphics2D;

import com.sun.glass.events.KeyEvent;

import Main.GamePanel;
import Objects.Grinch;
import Objects.Player;

public class PlayState extends GameState {

	private Player santa = new Player(0, 0);
	private Grinch grinchie = new Grinch();
	
	public static boolean col;

	private final int ESC = KeyEvent.VK_ESCAPE;

	public PlayState(GameStateManager gsm) {
		this.gsm = gsm;
	}

	@Override
	public void draw(Graphics2D g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, GamePanel.WIDTH, GamePanel.HEIGHT);

		santa.draw(g);
		grinchie.draw(g);
	}

	@Override
	public void update() {
		santa.update();
		grinchie.update();
		// if(ellie.dead()){
		// gsm.setState(GameStateManager.DEADSTATE);
		// }
		checkColission();
	}

	private void checkColission() {
		if (santa.x < grinchie.x + grinchie.WIDTH && santa.x + santa.WIDTH > grinchie.x
				&& santa.y < grinchie.y + grinchie.HEIGHT && santa.HEIGHT + santa.y > grinchie.y) {
			System.out.println("STOP FUCKING GRINCHIE SANTA");
			col = true;
		} else{
			col = false;
		}

	}

	@Override
	public void keyPressed(int key) {
		santa.keyPressed(key);
		grinchie.keyPressed(key);

		// if(key == SPACE){
		// gsm.setState(GameStateManager.PAUSESTATE);
		// }

		if (key == ESC) {
			System.exit(0);
		}
	}

	@Override
	public void keyReleased(int k) {
	}

	@Override
	public void init() {
	}
}
