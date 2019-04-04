import java.util.*;
class method3_3 {
	Scanner sc=new Scanner(System.in);
	public String pnum() {
		int n=sc.nextInt();
		if(n>0)
			return "양수";
		else if(n<0)
			return "음수";
		else 
			return "0";
	}
	public static void main(String ar[]) {
		method3_3 m33=new method3_3();
		System.out.println(m33.pnum());
	}
}