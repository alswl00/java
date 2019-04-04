import java.util.*;

class ArrayList_Test2 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list2=new ArrayList<Integer>();
		
		for(int i=0;i<10;i++) {
			int j=sc.nextInt();
			list2.add(j);
		}

		int max=list2.get(0);

		for(int i=1;i<10;i++) {
			if(max<list2.get(i)) max=list2.get(i);
		}
		
		System.out.println(max);


		for(int fruit: list2) {
			System.out.print(fruit+"  ");
		}
	}
}