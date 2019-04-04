class Car {
	String name;
	int baegi;

	public void crank() {
		System.out.println("¶ì¶ì~~");
	}
}

class Truck extends Car{
	String jeokjae;

	public void crank() {
		System.out.println("»§»§!");
	}

	public void jim() {}
}

class Sportcar extends Car{
	String jeokjae;
	public void crank() {
		System.out.println("»Ñ¿Í¾Ó–Ø¾Ó!!");
	}
}

class Car_main {
	public static void main(String ar[]) {
		Car c=new Car();
		Truck t=new Truck();
		Sportcar s=new Sportcar();
		c.crank();
		t.crank();
		s.crank();
	}
}