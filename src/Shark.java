import java.awt.Color;
import java.awt.Graphics2D;

import javax.swing.JLabel;

public class Shark extends Sprite {
	private Swim swim, swimTwo, swimThree, swimFour;
	private static int sharkDirection = 1;
	
	public Shark(float xLocation, float yLocation, float width, float height, String imageFile, Swim swimmer, Swim swimmerTwo, Swim swimmerThree, Swim swimmerFour) {
		super(xLocation, yLocation, width, height, imageFile, new Color(255, 0, 255));
		swim = swimmer;
		swimTwo = swimmerTwo;
		swimThree = swimmerThree;
		swimFour = swimmerFour;
	}

	@Override
	public void update(Keyboard keyboard) {
		super.update(keyboard);
			if(keyboard.isKeyDown(Key.RIGHT) || keyboard.isKeyDown(Key.LEFT) || keyboard.isKeyDown(Key.UP) || keyboard.isKeyDown(Key.DOWN)) {
				if (swim.getX() >= this.getX()) {
					sharkDirection = 0;
					moveRight(0.6f);
				} else {
					sharkDirection = 1;
					moveLeft(0.6f);
				}
				if (swim.getY() >= this.getY()) {
					moveDown(0.6f);
				} else {
					moveUp(0.6f);
				}	
			}
	}

	public boolean died() {
		if (this.intersects(swim) || this.intersects(swimTwo) || this.intersects(swimThree) || this.intersects(swimFour)) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public void draw(Graphics2D g) {
		super.draw(g);
	}
	
	public static int sharkDirection() {
		return sharkDirection;
	}
}