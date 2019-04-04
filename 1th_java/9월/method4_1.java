import java.util.*;
class method4_1 {
	Scanner sc=new Scanner(System.in);
	public void sum() {
		int x=sc.nextInt();
		int y=sc.nextInt();
		int sum=0;
		for(int i=x;i<=y;i++)
			sum+=i;
		System.out.println(sum);
	}
	public static void main(String ar[]) {
		method4_1 m41=new method4_1();
		m41.sum();
	}
}