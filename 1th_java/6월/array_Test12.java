//c언어 p.445 12번
class array_Test12 {
	public static void main(String ar[]) {
		int a[][]={{78,48,78,98,0},{99,92,83,29,0},{29,64,83,89,0},{34,78,92,56,0},{0,0,0,0,0}};
		int sum=0;

		System.out.println("가로의 합 : 	세로의 합 : ");
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				a[i][4]+=a[i][j];
				a[4][i]+=a[j][i];
			}
			System.out.println("	    "+a[i][4]+"		    "+a[4][i]);
			sum+=a[i][4]+a[4][i];
		}
		System.out.println("모든 수의 합 : "+sum);
	}
}