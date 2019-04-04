class extend_Test7 {
	public static void main(String ar[]) {
		Employee2 e01 = new Employee2("Sam","01");
		SalariedEmployee e02 = new SalariedEmployee("Bob","02");
		e02.setSalary(300);
		System.out.println(e02.name+" "+e02.num+" "+e02.salary);
		e02.computeSalary();
	}
}