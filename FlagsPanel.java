import java.awt.Graphics;
import javax.swing.JPanel;

public class FlagsPanel extends JPanel {
	Drawable[][] flags;

	/*
	 * Constructor receive int rows and int cols and creating the Drawable[][] flags
	 * array with those ints. The method generate random flags and insert it into
	 * the array.
	 */
	public FlagsPanel(int rows, int cols) {
		if (rows == 0 || cols == 0)
			return;
		this.flags = new Drawable[cols][rows];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				int random = (int) (Math.random() * 3);
				switch (random) {
				case 0:
					flags[j][i] = new FranceFlag();
					break;
				case 1:
					flags[j][i] = new GermanyFlag();
					break;
				case 2:
					flags[j][i] = new JapanFlag();
					break;
				}
			}
		}
	}

	/*
	 * paintComponent override method, using the draw method in order to fill the
	 * application frame with the flags array.
	 */
	public void paintComponent(Graphics g) {
		if (this.flags == null)
			return;
		int cols = flags.length;
		int rows = flags[0].length;
		int flagWidth = this.getWidth() / cols;
		int flagHeight = this.getHeight() / rows;
		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < rows; j++) {
				flags[i][j].draw(i * flagWidth, j * flagHeight, flagWidth, flagHeight, g);
			}
		}
	}
}
