import java.util.*;
class method4_3 {
	Scanner sc=new Scanner(System.in);
	public int sum() {
		int x=sc.nextInt();
		int y=sc.nextInt();
		int sum=0;
		for(int i=x;i<=y;i++) 
			sum+=i;
		return sum;
	}
	public static void main(String ar[]) {
		method4_3 m43=new method4_3();
		System.out.println(m43.sum());
	}
}