import java.awt.Color;
import java.awt.Graphics;

public class JapanFlag implements Drawable {
	/*
	 * Draw method (implements Drawable) receive (x, y) coordinates, width, height
	 * and Graphics g in order to fill the panel with the Japan flag using the
	 * coordinates and sizes it receive.
	 */
	@Override
	public void draw(int x, int y, int width, int height, Graphics g) {
		int k = height / 2;
		g.setColor(Color.white);
		g.fillRect(x, y, width, height);
		g.setColor(Color.red);
		g.fillOval((width / 2) - k / 2 + x, k / 2 + y, k, k);
	}

}
