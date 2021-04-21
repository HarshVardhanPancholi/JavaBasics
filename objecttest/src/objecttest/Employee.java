package objecttest;

public class Employee {
	private int empId;
	private String name;
	private float salary;
	private Gender gender;
	public Employee(int empId, String name, float salary, Gender g) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		gender =g;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		return empId;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if(!(obj instanceof Employee))
			return false;
		
		Employee other = (Employee) obj;
		if (empId == other.empId)
			return true;

		return false;
	}
	@Override
	public String toString() {
		//String genderDescription = gender == 1? "Male":"Female";
		return "EmpId= " + empId + "\nName= " + name + "\nSalary= " + salary+"\nGender is "+gender;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
	
	
}
