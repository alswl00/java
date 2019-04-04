//대문자를 소문자로 변형해서 출력
class hw16 {
	public static void main(String ar[]) {
		for (char c=65; c<=90; c++) {
			char h=(char)(c+32);
			System.out.println(h);
		}
	}
}