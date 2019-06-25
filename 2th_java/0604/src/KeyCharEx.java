import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyCharEx extends JFrame {
	JLabel la = 
		new JLabel("<Enter>Ű�� ������ �ٲ�ϴ�");
	
	KeyCharEx() {
		super("KeyListener�� ���� Ű �Է� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); 
		c.setLayout(new FlowLayout());
		c.add(la);
		c.addKeyListener(new MyKeyListener()); 
		setSize(250, 150);
		setVisible(true);
		c.requestFocus(); // ����Ʈ�ҿ� ��Ŀ�� ����
	}
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			// ������ ���� ����� ���� �����ϰ� r, g, b ���� ����
			int r = (int) (Math.random() * 256); // red ����
			int g = (int) (Math.random() * 256); // green ����
			int b = (int) (Math.random() * 256); // blue ����

			switch(e.getKeyChar()) { // �Էµ� Ű ����
				case '\n': // <Enter> Ű �Է�
					la.setText("r=" + r + ", g=" + g + ", b=" + b);
					getContentPane().setBackground(
													new Color(r, g, b)); 
					break;
				case 'q':
					System.exit(0); 
			}
		}
	}
	public static void main(String[] args) {
		new KeyCharEx();
	}
}