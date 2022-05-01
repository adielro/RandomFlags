import java.awt.Color;
import java.awt.Graphics;

public class GermanyFlag implements Drawable {
	/*
	 * Draw method (implements Drawable) receive (x, y) coordinates, width, height
	 * and Graphics g in order to fill the panel with the Germany flag using the
	 * coordinates and sizes it receive.
	 */
	@Override
	public void draw(int x, int y, int width, int height, Graphics g) {
		g.setColor(Color.black);
		g.fillRect(x, y, width, height / 3);
		g.setColor(Color.red);
		g.fillRect(x, y + height / 3, width, height / 3);
		g.setColor(Color.yellow);
		g.fillRect(x, y + (height / 3) * 2, width, height / 3);
	}

}
