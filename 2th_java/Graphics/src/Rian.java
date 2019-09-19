import javax.swing.*;
import java.awt.*;

public class Rian extends JFrame {
	private MyPanel panel = new MyPanel();
	public Rian() {
		setTitle("Rian 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(500, 500);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.ORANGE);
			g.fillOval(140,110,60,60);
			g.setColor(Color.ORANGE);
			g.fillOval(270, 110, 60, 60);
			g.setColor(Color.ORANGE);
			g.fillOval(120,120,230,210);
			g.setColor(Color.BLACK);
			g.fillRoundRect(170,180,40,8,2,2);
			g.fillRoundRect(260,180,40,8,2,2);
			g.fillOval(185, 205, 15, 15);
			g.fillOval(275, 205, 15, 15);
			g.setColor(Color.white);
			g.fillOval(210, 240, 30, 30);
			g.fillOval(235, 240, 30, 30);
			g.setColor(Color.BLACK);
			g.fillOval(227, 235, 20, 20);
		}
	}	
	public static void main(String [] args) {
		new Rian();
	}
}
