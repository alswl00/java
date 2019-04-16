import java.io.*;
public class FileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char buffer[]=new char[100];
		try {
			FileReader fr =new FileReader("datar.txt");
			FileWriter fw =new FileWriter("dataw.txt");
			/*fr.read(buffer,0,100);
			String str=new String(buffer);
			System.out.println(str);
			fw.write(buffer);*/
			
			int c;
			while((c=fr.read())!=-1) {
				fw.write(c);
			}
			
			fw.flush();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
