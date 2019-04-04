class sum4 {
	public int sum(int x) {
		int sum=0;
		for(int i=1;i<=x;i++) 
			sum+=i;
		return sum;
	}
	public static void main(String ar[]) {
		sum4 s=new sum4();
		System.out.println(s.sum(5));
	}
}