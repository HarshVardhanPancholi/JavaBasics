package newproject;
import java.time.LocalDate;
import java.time.Period;


public class Employee {


		private int empId;
		private String firstName;
		private String lastName;
		private LocalDate dateOfBirth;
		private float salary;
		public Employee(int empId, String firstName, String lastName, LocalDate dateOfBirth, float salary) throws EmployeeTooYoungException, InvalidNameException, InvalidSalaryException{
			this.empId = empId;
			if(firstName.equals("")) {
				throw new InvalidNameException("First Name is empty");
			}
			if(lastName.equals("")) {
				throw new InvalidNameException("Last Name is empty");
			}
			if(salary< 3000) {
				throw new InvalidSalaryException("Invalid salary");
			}
			LocalDate current=java.time.LocalDate.now();
			Period age = Period.between(dateOfBirth, current);
			if(age.getYears()<15) {
				throw new EmployeeTooYoungException("Too young");
			}
			this.firstName = firstName;
			this.lastName = lastName;
			this.dateOfBirth = dateOfBirth;
			this.salary = salary;
		}
		public int getEmpId() {
			return empId;
		}

		
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) throws InvalidNameException{
			if(firstName.equals("")) {
				throw new InvalidNameException("First Name is empty");
			}
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) throws InvalidNameException{
			if(lastName.equals("")) {
				throw new InvalidNameException("Last Name is empty");
			}
			this.lastName = lastName;
		}
		public LocalDate getDateOfBirth() {
			
			return dateOfBirth;
		}
		public void setDateOfBirth(LocalDate dateOfBirth) throws EmployeeTooYoungException{
			LocalDate current=java.time.LocalDate.now();
			Period age = Period.between(dateOfBirth, current);
			if(age.getYears()<15) {
				throw new EmployeeTooYoungException("Too young");
			}
			this.dateOfBirth = dateOfBirth;
		}
		public float getSalary() {
			return salary;
		}
		public void setSalary(float salary) throws InvalidSalaryException{
			if(salary< 3000) {
				throw new InvalidSalaryException("Invalid salary");
			}
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "empId= " + empId + "\nName= " + firstName + " " + lastName + "\ndateOfBirth= "
					+ dateOfBirth + "\nsalary= " + salary;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (!(obj instanceof Employee))
				return false;
			Employee other = (Employee) obj;
			if (empId == other.empId)
				return true;

			return false;
		}
		
		
		
		
	
}
