import java.io.*;
import java.util.*;
public class Phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String num;
			FileWriter fout=null; 
		try {
			fout=new FileWriter("Phone.txt");
			while(true) {
				System.out.print("name PhoneNumber>>");
				num=sc.nextLine();
				if(num.equals("�׸�")) break;
				fout.write(num+"\r\n");
			}
			fout.close();
		}catch(IOException e) {
			System.out.println("Phone.txt�� ������ �� �������ϴ�. ��θ��� Ȯ���� �ּ���");
			return;
		}
		System.out.println("Phone.txt�� ����Ǿ����ϴ�.");
	}

}
