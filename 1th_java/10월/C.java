class A{
	public A(){
		System.out.println("������A");
	}

	A(int x) {
		System.out.println("�Ű�����������A");
	}
}

class B extends A {
	B() {
		System.out.println("������B");
	}

	public B(int x) {
		//super();
		System.out.println("�Ű�����������B");
	}
}

class C {
	public static void main(String ar[]) {
		B b=new B(5);
	}
}

//20-21-22-16-2-3-4-17-18-19-24-25