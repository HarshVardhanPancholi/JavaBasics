package arrayproject;

public class Employee {
	int empId;
	float salary;
	String name;

	
	public Employee(int empId, float salary,String nm) {
		this.empId = empId;
		this.salary = salary;
		name = nm;
	}

	void setempId(int nm) {
		empId=nm;
	}
	public void show() {
		System.out.println(empId);
		System.out.println(salary);
		System.out.println(name);
	}
}
