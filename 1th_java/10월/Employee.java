class Employee {
	private String name;
	private int salary;
	private String hiredate;

	Employee(String name, int salary, String hiredate) {
		this.name=name;
		this.salary=salary;
		this.hiredate=hiredate;
	}

	Employee(String name, String hiredate) {
		this.name=name;
		this.hiredate=hiredate;
	}

	Employee(int salary,String hiredate) {
		this.salary=salary;
		this.hiredate=hiredate;
	}

	Employee(String name,int salary) {
		this.name=name;
		this.salary=salary;
	}
	
	public void setHiredate(String s) {
		System.out.println(s);
	}

	public int getSalary() {
		return salary;
	}

	public static void main(String ar[]) {
		Employee e1=new Employee("Mike",100,"2018-03-01");
		Employee e2=new Employee("Alice","2017-03-02");
		Employee e3=new Employee(300,"2016-05-03");
		Employee e4=new Employee("Tomas",500);

		e2.setHiredate("2015-05-03");
		System.out.println(e4.getSalary());
	}
}