import java.io.*;
public class BufferInputExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String s="";
		try {
			s=in.readLine();
		}catch(Exception e) {
			System.out.println("Errer : "+e.toString());
		}
		System.out.println(s);
	}

}
