import java.util.*;
class method3_2 { 
	public void pnum(int n){
		if(n>0)
			System.out.println("양수");
		else if(n<0)
			System.out.println("음수");
		else System.out.println("0");
	}
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		method3_2 m32=new method3_2();
		int n=sc.nextInt();
		m32.pnum(n);
	}
}