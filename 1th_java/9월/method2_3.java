import java.util.*;
class method2_3 {
	Scanner sc=new Scanner(System.in);
	public int absolute() {
		int n=sc.nextInt();
		if(n<0)
			return -n;
		else 
			return n;
	}
	public static void main(String ar[]) {
		method2_3 m23=new method2_3();
		System.out.println("Àý´ñ°ª>>"+m23.absolute());
	}
}