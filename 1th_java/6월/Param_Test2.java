class Param_Test2 {
	public static void main(String ar[]) {
	
		int a[]=new int [5];
		 a[0]=Integer.parseInt(ar[0]);
		 a[1]=Integer.parseInt(ar[1]);
		 a[2]=Integer.parseInt(ar[2]);
		 a[3]=Integer.parseInt(ar[3]);
		 a[4]=Integer.parseInt(ar[4]);

		int max=a[0],min=a[0];

		for(int i=0;i<ar.length;i++) {
			if(a[i]>max)
				max=a[i];
			else if(a[i]<min)
				min=a[i];
		}
		System.out.println("ÃÖ´ñ°ª : "+max+" ÃÖ¼Ú°ª : "+min);
	}
}