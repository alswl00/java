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
	System.out.println("최대 탑승 인원 : "+s.Passengers()+"명");
	System.out.println("최대 적재량 : "+s.Luggage()+"kg");
	}
}