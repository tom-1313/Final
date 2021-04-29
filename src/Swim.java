import java.awt.Color;
import java.awt.Graphics2D;

public class Swim extends Sprite {
	private static int swimDirection = 0;
	
	public Swim(float xLocation, float yLocation, float width, float height, String imageFile) {
		super(xLocation, yLocation, width, height, imageFile, new Color(255, 0, 255));
	}

	@Override
	public void update(Keyboard keyboard) {
		super.update(keyboard);
		if(keyboard.isKeyDown(Key.DOWN)) {
			swimDirection = 0;
			moveDown(1);
		}
		if(keyboard.isKeyDown(Key.UP)) {
			swimDirection = 1;
			moveUp(1);
		} 
		if(keyboard.isKeyDown(Key.RIGHT)) {
			swimDirection = 2;
			moveRight(1);
		}
		if(keyboard.isKeyDown(Key.LEFT)) {
			swimDirection = 3;
			moveLeft(1);
		}
		
		
	}

	@Override
	public void draw(Graphics2D g) {
		super.draw(g);
	}
	
	public static int SwimDirection() {
		return swimDirection;
	}
}
