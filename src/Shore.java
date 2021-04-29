import java.awt.Color;
import java.awt.Graphics2D;

import javax.swing.JLabel;

public class Shore extends Rectangle {
	private Swim swim, swimTwo, swimThree, swimFour;
	
	public Shore(float xLocation, float yLocation, float width, float height, Swim swimmer,  Swim swimmerTwo, Swim swimmerThree, Swim swimmerFour) {
		super(xLocation, yLocation, width, height);
		this.setColor(Color.yellow);
		swim = swimmer;
		swimTwo = swimmerTwo;
		swimThree = swimmerThree;
		swimFour = swimmerFour;
	}

	@Override
	public void update(Keyboard keyboard) {
		super.update(keyboard);
	}

	@Override
	public void draw(Graphics2D g) {
		super.draw(g);
	}
	
	public boolean safe() {
		if (this.intersects(swim)) {
			return true;
		} else {
			return false;
		}
	}
}