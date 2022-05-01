import java.util.Scanner;
import javax.swing.JFrame;

public class main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		int x = s.nextInt();
		int y = s.nextInt();
		JFrame frame = new JFrame("Tester");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1500, 1200);
		FlagsPanel p = new FlagsPanel(x, y);
		frame.add(p);
		frame.setVisible(true);
	}
}
