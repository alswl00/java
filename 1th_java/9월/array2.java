class array2{
	public static void main(String ar[]) {
		int a[]=new int[100];
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			a[i]=i+1;
			if(a[i]%2==0) 
				sum+=a[i];
		}
		System.out.println(sum);
	}
}