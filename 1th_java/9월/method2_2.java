import java.util.*;
class method2_2 {
	public void absolute(int n){
		if(n<0)
			System.out.println(n+"ÀÇ Àý´ñ°ª>>"+(-n));
		else
			System.out.println(n+"ÀÇ Àý´ñ°ª>>"+n);
	}
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		method2_2 m22=new method2_2();
		int n=sc.nextInt();
		m22.absolute(n);
	}
}