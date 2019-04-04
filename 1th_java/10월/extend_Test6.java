public class extend_Test6 {
	public static void main(String ar[]) {
		person10 p=new person10("Alice","100-101","#82-000-3333");
		Customer c=new Customer("Tom","101-412","#82-622-8909","10249304",100);
		p.setName("Alice");
		p.setAddr("100-101");
		p.setTel("#82-000-2222");
		System.out.println(c.name+" "+c.addr+" "+c.tel+" "+c.customNum+" "+c.mileage);
		System.out.println(p.getName()+" "+p.getAddr()+" "+p.getTel());
	}
}