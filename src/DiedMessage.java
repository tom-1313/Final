import java.awt.Color;
import java.awt.Graphics2D;

import javax.swing.JLabel;

public class DiedMessage extends Sprite {
	private Swim swim;
	public DiedMessage(float xLocation, float yLocation, float width, float height, String imageFile) {
		super(xLocation, yLocation, width, height, imageFile);
	}

	@Override
	public void update(Keyboard keyboard) {
		super.update(keyboard);
	}

	@Override
	public void draw(Graphics2D g) {
		super.draw(g);
	}
}