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
		return x+"��";
	}
	public String stop(int x) {
		return x+"��";
	}
	public String take() {
		return "���� ž�����ּ���";
	}
}
class Vehicle_main {
	public static void main(String ar[] ) {
		train t=new train();
		System.out.println("�̸� : "+t.name+"  ���� : "+t.price);
		System.out.println("��߽ð� : "+t.start(6));
		System.out.println("�����ð� : "+t.stop(9));
		System.out.println(t.start(6)+t.take());
	}
}