import java.io.*;
public class BufferedReaderExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			String aa=br.readLine();
			System.out.println(aa);
		}catch(IOException ie) {}
	}

}
