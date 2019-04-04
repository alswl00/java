class array_Test10 {
	public static void main(String ar[]) {
		int a[][]=new int[2][3];
		int n=1;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				a[i][j]=n++;
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
	}
}