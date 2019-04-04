abstract class Ship2 {
	public abstract int maxspeed();
	public abstract int passenger();
}

class yout extends Ship2{
	public int maxspeed() {
		return 9;
	}
	public int passenger() {
		return 9;
	}
}

class boat extends Ship2{
	public int maxspeed() {
		return 8;
	}
	public int passenger() {
		return 7;
	}
}

class Ship2_main{
	public static void main(String ar[]){
		yout y=new yout();
		boat b=new boat();
		System.out.println("요트 | 최대 속력 : "+y.maxspeed()+"  탑승 인원"+y.passenger());
		System.out.println("보트 | 최대 속력 : "+b.maxspeed()+"  탑승 인원"+b.passenger());
	}
}