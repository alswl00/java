class extend_Test4 {
	public static void main(String ar[]) {
		Truck t=new Truck("트럭","프론티어","검정색",3);
		System.out.println("나의 "+t.type+"은 "+t.color+"이다");
		System.out.println(t.carname+"는 "+t.heavy+"톤을 실을 수 있다.");
	}
}