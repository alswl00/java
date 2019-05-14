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
				if(num.equals("그만")) break;
				fout.write(num+"\r\n");
			}
			fout.close();
		}catch(IOException e) {
			System.out.println("Phone.txt에 저장할 수 없었습니다. 경로명을 확인해 주세요");
			return;
		}
		System.out.println("Phone.txt에 저장되었습니다.");
	}

}
