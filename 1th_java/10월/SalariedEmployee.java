class SalariedEmployee extends Employee2 {
	double salary;

	SalariedEmployee(String name, String num) {
		super(name,num);
		this.name=name;
		this.num=num;
	}
	public void setSalary(double _salary) {
		this.salary=_salary;
	}
	public double getSalary() {
		return salary;
	}
	public void computeSalary() {
		System.out.println(salary*12);
	}
}