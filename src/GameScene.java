import java.awt.Color;
import java.awt.Graphics2D;
import java.io.File;

public class GameScene {
	private Bounds bounds;
	private Swim swimmerR, swimmerL, swimmerU, swimmerD;
	private Shark sharkR, sharkL;
	private DiedMessage died;
	private WinMessage win;
	private Shore beach;
	private SpriteFont text, instructions;

	public void initialize(Bounds bounds) {
		this.bounds = bounds;
		text = new SpriteFont("SHARK! GET TO SHORE! --->", 250, 20, "Times New Roman", 20, Color.RED);
		instructions = new SpriteFont("Use arrow keys to move.", 275, 550, "Times New Roman", 15, Color.RED);

		swimmerR = new Swim(90, 90, 26, 23, "swimmer.png");
		swimmerL = new Swim(90, 90, 26, 23, "swimLeft.png");
		swimmerD = new Swim(90, 90, 26, 23, "swimDown.png");
		swimmerU = new Swim(90, 90, 26, 23, "swimUp.png");
		
		sharkR = new Shark(650, 250, 83, 57, "sharkRight.png", swimmerR, swimmerL, swimmerD, swimmerU);
		sharkL = new Shark(650, 250, 83, 57, "sharkLeft.png", swimmerR, swimmerL, swimmerD, swimmerU);
		
		died = new DiedMessage(0, 1, 800, 600, "died.jpg");
		win = new WinMessage(0, 1, 800, 600, "win.jpg");
		beach = new Shore(750, 0, 100, 850, swimmerR, swimmerL, swimmerD, swimmerU);
	}

	public void update(Keyboard keyboard) {
		instructions.update(keyboard);
		text.update(keyboard);
		swimmerR.update(keyboard);
		swimmerL.update(keyboard);
		swimmerD.update(keyboard);
		swimmerU.update(keyboard);
		sharkR.update(keyboard);
		sharkL.update(keyboard);
		
	}

	public void draw(Graphics2D g) {
		instructions.draw(g);
		text.draw(g);
		switch (Swim.SwimDirection()) {
		case 0:
			swimmerD.draw(g);
			break;
		case 1:
			swimmerU.draw(g);
			break;
		case 2:
			swimmerR.draw(g);
			break;
		case 3:
			swimmerL.draw(g);
			break;
		default:
			swimmerR.draw(g);
		}
		switch (Shark.sharkDirection()) {
		case 0:
			sharkR.draw(g);
			break;
		case 1:
			sharkL.draw(g);
			break;
		default:
			sharkL.draw(g);
		}
		beach.draw(g);
		if (sharkR.died()) {
			died.draw(g);
		}
		if (beach.safe()) {
			win.draw(g);
		}
	}
	
}
