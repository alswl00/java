interface Movable{
	public abstract void speedUp(int amount);
	public abstract void speedDown(int amount);
}

class Vehicle{
	int speed;
	public void setSpeed(int s) {
		speed=s;
	}
	public int getSpeed() {
		return speed;
	}
}

class car extends Vehicle implements Movable {
	String carNum;
	int speed=50;
	car(String carNum) {
		this.carNum=carNum;
	}
	public void speedUp(int amount) {
		System.out.println("�ӵ� "+amount+"����");
		speed+=amount;
	}
	public void speedDown(int amount) {
		System.out.println("�ӵ� "+amount+"����");
		speed-=amount;
	}

	public String toString() {//������� ��ü���
		return "�� ��ȣ : "+carNum+"   �ӵ� : "+speed;
	}
}

class car3 extends Vehicle implements Movable {
	String yacht;//��Ʈ ��Ϲ�ȣ
	int speed=20;
	car3(String yacht) {
		this.yacht=yacht;
	}
	public void speedUp(int amount) {
		System.out.println("�ӵ� "+amount+"����");
		speed+=amount;
	}
	public void speedDown(int amount) {
		System.out.println("�ӵ� "+amount+"����");
		speed-=amount;
	}
	public String toString() {
		return "��Ʈ ��Ϲ�ȣ : "+yacht+"   �ӵ� : "+speed;
	}
}

class car3_Test {
	public static void main(String ar[] ) {
		car c=new car("2�� 3827");
		car3 c3=new car3("��4029");
		//c.setSpeed(50);
		//c3.setSpeed(20);
		c.speedUp(20);
		c3.speedDown(30);
		System.out.println(c.toString());
		System.out.println(c3.toString());
	}
}