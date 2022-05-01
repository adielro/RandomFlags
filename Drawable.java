import java.awt.Graphics;

public interface Drawable {
	/*
	 * Abstract method that receive the (x, y) coordinates, width, height and Graphics g.
	 */
	public abstract void draw(int x, int y, int width, int height, Graphics g);
}
