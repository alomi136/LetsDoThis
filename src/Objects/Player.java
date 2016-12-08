package Objects;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import Main.GamePanel;

public class Player extends GameObject {
	//blablabla
	//this is my second commit
	public final int WIDTH = 40;
	public  final int HEIGHT = 40;
	private final int UPKEY = KeyEvent.VK_UP;
	private final int DOWNKEY = KeyEvent.VK_DOWN;
	private final int LEFTKEY = KeyEvent.VK_LEFT;
	private final int RIGHTKEY = KeyEvent.VK_RIGHT;
	
	public Player(int x, int y){
		super(x, y);
	}
	
	public int x = GamePanel.WIDTH / 2;
	public int y = GamePanel.HEIGHT / 2;

	private double velY = 2, velX = 2;
	private final int UP = 0, DOWN = 1, LEFT = 2, RIGHT = 3;
	private int direction = RIGHT;

//	private BufferedImage santa = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);

	public void draw(Graphics2D g) {
//		try {
//			santa = ImageIO.read(getClass().getResourceAsStream("/Sprites/santa.png"));
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		g.drawImage(santa, x, y, null);
		
		g.setColor(Color.red);
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
		 if(dead()){
			 GamePanel.running = false;
			 
		 }

	}

	 public boolean dead() {
	
		 if (x < 0 || y < 0 || x >= GamePanel.WIDTH - WIDTH  || y >= GamePanel.HEIGHT - HEIGHT) {
			return true;
		}

	return false;
	 }
}
