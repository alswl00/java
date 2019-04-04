class Car3 {
	String name="차";
	String print() {
		return "[나는 "+name+"이다.]";
	}
}
class Bus extends Car3{
	String name="버스";
	String print() {
		return "[차의 종류는 "+name+"이다.]";
	}
}
class Truck2 extends Car3{
	String name="트럭";
	String print() {
		return "[차의 종류는 "+name+"이다.]";
	}
}
class CastingExam{
	public static void main(String ar[]) {
		Car3 mycar,yourcar;
		Bus mybus,yourbus;
		Truck2 mytruck,yourtruck;
		mycar=new Car3();
		mybus=new Bus();
		mytruck=new Truck2();

		System.out.println("["+mycar.print()+"]");
		System.out.println("["+mybus.print()+"]");
		System.out.println("["+mytruck.print()+"]");
		yourcar=mybus;
		yourbus=(Bus)yourcar;
		System.out.println("["+yourbus.print()+"]");
		yourcar=mytruck;
		yourtruck=(Truck2)yourcar;
		System.out.println("["+yourtruck.print()+"]");
	}
}