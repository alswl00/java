class Car3 {
	String name="��";
	String print() {
		return "[���� "+name+"�̴�.]";
	}
}
class Bus extends Car3{
	String name="����";
	String print() {
		return "[���� ������ "+name+"�̴�.]";
	}
}
class Truck2 extends Car3{
	String name="Ʈ��";
	String print() {
		return "[���� ������ "+name+"�̴�.]";
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