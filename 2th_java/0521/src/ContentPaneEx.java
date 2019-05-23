import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame{
	ContentPaneEx(){
		setTitle("ContentPane�� JFrame ����");		//�������� Ÿ��Ʋ�ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane=getContentPane();	//����Ʈ�� �˾Ƴ���
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());	//����Ʈ�ҿ� flowlayout ��ġ������ �ޱ�
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContentPaneEx();
	}

}
