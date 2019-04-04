class A{
	public A(){
		System.out.println("생상자A");
	}

	A(int x) {
		System.out.println("매개변수생성자A");
	}
}

class B extends A {
	B() {
		System.out.println("생성자B");
	}

	public B(int x) {
		//super();
		System.out.println("매개변수생성자B");
	}
}

class C {
	public static void main(String ar[]) {
		B b=new B(5);
	}
}

//20-21-22-16-2-3-4-17-18-19-24-25