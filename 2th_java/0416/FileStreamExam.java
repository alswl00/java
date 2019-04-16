import java.io.*;
public class FileStreamExam {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte[] b=new byte[1024];
		FileInputStream fis=new FileInputStream("tin.txt");
		FileOutputStream fos=new FileOutputStream("tout.txt");
		fis.read(b);
		fos.write(b);
		fis.close();
		fos.close();
	}

}
