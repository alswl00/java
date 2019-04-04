class Car2{
	private String brand;
	private String owner;
	private String company;
	private int price;

	Car2(String brand, String owner, String company,int price){
		this.brand=brand;
		this.owner=owner;
		this.company=company;
		this.price=price;
	}

	Car2(String owner, String company, int price){
		this.owner=owner;
		this.company=company;
		this.price=price;
	}

	Car2(String owner,int price) {
		this.owner=owner;
		this.price=price;
	}

	public String start() {
		return "출발하다";
	}

	public String stop() {
		return "멈추다";
	}

	public static void main(String ar[]) {
		Car2 c1=new Car2("sonata","mike","hyundae",210);
		Car2 c2=new Car2("Alice","kia",300);
		Car2 c3=new Car2("Tom",350);
		Car2 c4=new Car2("Benz","Tomas","mk",500);

		System.out.println(c3.brand+" "+c3.owner+" "+c3.company+" "+c3.price);
		c4.start();
		c4.stop();
	}
}