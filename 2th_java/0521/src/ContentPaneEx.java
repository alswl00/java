import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame{
	ContentPaneEx(){
		setTitle("ContentPane과 JFrame 예제");		//프레임의 타이틀달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane=getContentPane();	//컨텐트팬 알아내기
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());	//컨텐트팬에 flowlayout 배치관리자 달기
		
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
