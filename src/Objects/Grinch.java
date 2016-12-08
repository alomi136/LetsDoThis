package Objects;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import com.sun.javafx.geom.Rectangle;

import GameState.PlayState;
import Main.GamePanel;

public class Grinch extends Rectangle {
	public final int WIDTH = 30;
	public final int HEIGHT = 30;
	
	private final int UPKEY = KeyEvent.VK_W;
	private final int DOWNKEY = KeyEvent.VK_S;
	private final int LEFTKEY = KeyEvent.VK_A;
	private final int RIGHTKEY = KeyEvent.VK_D;

	public int x = GamePanel.WIDTH / 3;
	public int y = GamePanel.HEIGHT / 3;

	private double velY = 1, velX = 1;
	private final int UP = 0, DOWN = 1, LEFT = 2, RIGHT = 3;
	private int direction = RIGHT;
	
//	private BufferedImage grinch = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);

	public void draw(Graphics2D g) {
//		try {
//			grinch = ImageIO.read(getClass().getResourceAsStream("/Sprites/grinch.png"));
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		g.drawImage(grinch, x, y, null);
		
		
		if (PlayState.col == true) {
			g.setColor(Color.blue);
		} else{
			g.setColor(Color.GREEN);
		}
		g.fillRect(x, y, WIDTH, HEIGHT);
	}

	public void keyPressed(int key) {

		if (key == UPKEY && direction != DOWN) {
			direction = UP;
		}

		if (key == DOWNKEY && direction != UP) {
			direction = DOWN;
		}

		if (key == RIGHTKEY && direction != LEFT) {
			direction = RIGHT;
		}
		if (key == LEFTKEY && direction != RIGHT) {
			direction = LEFT;
		}
	}

	public void update() {
		switch (direction) {

		case UP:
			y -= velY;

			break;

		case DOWN:
			y += velY;

			break;

		case RIGHT:
			x += velX;

			break;

		case LEFT:

			x -= velX;

			break;
		}

		if (dead()) {
			System.exit(0);

		}

	}

	public boolean dead() {
		
		if (x < 0 || y < 0 || x >= GamePanel.WIDTH - WIDTH  || y >= GamePanel.HEIGHT - HEIGHT) {
			return true;
		}

		return false;
	}
}
