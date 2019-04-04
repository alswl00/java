import java.util.*;
class method4_2 {
	public void sum(int x,int y){
		int sum=0;
		for(int i=x;i<=y;i++)
			sum+=i;
		System.out.println(sum);
	}
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		method4_2 m42=new method4_2();
		int x=sc.nextInt();
		int y=sc.nextInt();
		m42.sum(x,y);
	}
}