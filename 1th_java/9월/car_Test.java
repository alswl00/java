class car_Test {
	public static void main(String ar[]) {
		car c=new car();
		c.color="red";
		c.price="10 billion";
		c.year=2007;
		c.brand="Ferrari";
		c.kind="sport car";

		c.drive();
		c.parking();
		c.stop();
		c.pay();
	}
}