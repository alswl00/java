class for2_Test4 {
	public static void main(String ar[]) {
		int n=5;
		for (int i=n; i>=1; i--) {
			for (int j=n; j>=i; j--) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
}