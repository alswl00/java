class overloading_Test1 {
	public void add(int x,int y){ 
		System.out.println(x+y);
	}
	public void add(double x,double y,double z){
		System.out.println(x+y+z);
	}
	public String add(String x,String y){
		return x+y;
	}
	public void add(int x,int y,String z){
		System.out.println(x+y+z);
	}
	public static void main(String ar[]) {
		overloading_Test1 t=new overloading_Test1();
		t.add(2,5);
		t.add(3.5,2.8,9.2);
		System.out.println(t.add("java","c"));
		t.add(3,5,"cool");
	}
}