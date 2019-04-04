//대문자, 배열의 크기 출력
class array_Test2 {
	public static void main(String ar[]) {
		char c[]=new char[26];
		
		for(int i=0;i<c.length;i++) {
			c[i]=(char)(i+65);
			System.out.println(c[i]);
		}
		System.out.println("");
		System.out.println("배열의 크기 : "+c.length);
	}
}