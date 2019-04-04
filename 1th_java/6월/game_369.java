class game_369 {
	public static void main(String ar[]) {
		for(int i=1;i<=100;i++) {
			System.out.print(i);
			if(i/10==3||i/10==6||i/10==9)
				System.out.print("¦!");
			if(i%10==3||i%10==6||i%10==9)
				System.out.print("¦!");
			System.out.println();	
		}
	}
}