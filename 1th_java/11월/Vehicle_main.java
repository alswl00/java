abstract class Vehicle {
	String name;
	int price;

	abstract public String start(int x);
	abstract public String stop(int x);
	abstract public String take();
}

class train extends Vehicle{
	String name="OOO";
	int price=50000;
	public String start(int x) {
		return x+"시";
	}
	public String stop(int x) {
		return x+"시";
	}
	public String take() {
		return "까지 탑승해주세요";
	}
}
class Vehicle_main {
	public static void main(String ar[] ) {
		train t=new train();
		System.out.println("이름 : "+t.name+"  가격 : "+t.price);
		System.out.println("출발시각 : "+t.start(6));
		System.out.println("도착시각 : "+t.stop(9));
		System.out.println(t.start(6)+t.take());
	}
}