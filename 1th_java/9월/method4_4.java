import java.util.*;
class method4_4 {
	public int sum(int x,int y){
		int sum=0;
		for(int i=x;i<=y;i++)
			sum+=i;
		return sum;
	}
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		method4_4 m44=new method4_4();
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println(m44.sum(x,y));
	}
}