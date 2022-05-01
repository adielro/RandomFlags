import java.awt.Color;
import java.awt.Graphics;

public class FranceFlag implements Drawable {
	/*
	 * Draw method (implements Drawable) receive (x, y) coordinates, width, height
	 * and Graphics g in order to fill the panel with the France flag using the
	 * coordinates and sizes it receive.
	 */
	@Override
	public void draw(int x, int y, int width, int height, Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x, y, width / 3, height);
		g.setColor(Color.white);
		g.fillRect(x + (width / 3), y, width / 3, height);
		g.setColor(Color.red);
		g.fillRect(x + (width / 3) * 2, y, width / 3, height);
	}

}
