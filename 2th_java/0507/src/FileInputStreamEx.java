import java.io.FileInputStream;
import java.io.IOException;
public class FileInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[]= new byte[6];
		try {
			FileInputStream fin=new FileInputStream("test.out");
			int n=0,c;
			while((c=fin.read())!=-1) {
				b[n]=(byte)c;
				n++;
			}
			System.out.println("test.out���� ���� �迭�� ����մϴ�.");
			for(int i=0;i<b.length;i++)
				System.out.print(b[i]+" ");
			System.out.println();
			fin.close();
		}catch(IOException e) {
			System.out.println("test.out���� ���� ���߽��ϴ�. "+"��θ��� üũ�غ�����.");
		}
	}

}
