import java.util.*;
class method1_3 {
	Scanner sc=new Scanner(System.in);
	public String num() {
		int n=sc.nextInt();
		if(n%2==0)
			return "Â¦¼ö";
		else 
			return "È¦¼ö";
	}
	public static void main(String ar[]) {
		method1_3 m13=new method1_3();
		System.out.println(m13.num());
	}
}