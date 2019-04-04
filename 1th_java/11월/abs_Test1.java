abstract class person30 {
	String name;
	int age;

	public void go(){
		System.out.println("°¡´Ù");
	}

	abstract public void walk();
	abstract public int count(int num);//ÀÎ¿ø¼ö
}
//person30Àº °´Ã¼ ¸ø¸¸µë

abstract class child extends person30 {		//walk, count ¸öÅë¸¸µé¾îÁà¾ßÇÔ
	public void walk() {
		System.out.println("°È´Ù");
	}
}

class child2 extends child {
	public int count(int num) {
		return num;
	}
}

class abs_Test1 {
	public static void main(String ar[]) {
		child2 c=new child2();
		c.walk();
		System.out.println(c.count(5)+"¸í");
	}
}