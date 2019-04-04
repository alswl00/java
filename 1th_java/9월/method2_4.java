import java.util.*;
class method2_4 {
	public int absolute(int n){
		if(n<0)
			return -n;
		else 
			return n;
	}
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		method2_4 m24=new method2_4();
		int n=sc.nextInt();
		System.out.println(n+"ÀÇ Àý´ñ°ª>>"+m24.absolute(n));
	}
}