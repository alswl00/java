abstract class Ship {
	public abstract int Passengers();
	public abstract int Luggage();
}

class ship_ extends Ship{
	public int Passengers() {
		return 10;
	}
	public int Luggage() {
		return 10;
	}
}

class Ship_main{
	public static void main(String ar[]){
	ship_ s=new ship_();
	System.out.println("�ִ� ž�� �ο� : "+s.Passengers()+"��");
	System.out.println("�ִ� ���緮 : "+s.Luggage()+"kg");
	}
}