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
		System.out.println("��Ʈ | �ִ� �ӷ� : "+y.maxspeed()+"  ž�� �ο�"+y.passenger());
		System.out.println("��Ʈ | �ִ� �ӷ� : "+b.maxspeed()+"  ž�� �ο�"+b.passenger());
	}
}