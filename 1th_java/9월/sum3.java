class sum3 {
	public int sum() {
		int sum=0;
		for(int i=0;i<=5;i++)
			sum+=i;
		return sum;
		}
	public static void main(String ar[]) {
		sum3 s=new sum3();
		System.out.println(s.sum());
	}
}