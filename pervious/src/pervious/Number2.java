package pervious;

class SalaryData{
	String name;
	int daysinMonth;
	double salary;
	SalaryData(String name, int daysInMonth, double salary){
		this.name= name;
		this.daysinMonth= daysInMonth;
		this.salary= salary;
	}
	
	
}

class Validator{
	public String validateSalaryData(SalaryData s) throws InvalidDayExceptions, InvalidSalaryExceptions{
		if(s.daysinMonth<28 || s.daysinMonth>31) {
			throw new InvalidDayExceptions("Invalid Salary");
			}
		if(s.salary<=0.0 || s.salary>1000000.0) {
			throw new InvalidSalaryExceptions("Invalid Salary");
		}
			return "Valid Data";
		
	}
	public double getTotalSalary(SalaryData s){
		try {
			System.out.println(validateSalaryData(s));
		}
		catch(InvalidDayExceptions e) {
			System.out.println(e.getMessage());
			return 0.0;
		}
		catch(InvalidSalaryExceptions e) {
			System.out.println(e.getMessage());
			return 0.0;
		}
		return (s.daysinMonth*s.salary);
	}
	
}
class InvalidDayExceptions extends RuntimeException{
	public InvalidDayExceptions(String str){
		super(str);
	}
}
class InvalidSalaryExceptions extends RuntimeException{
	public InvalidSalaryExceptions(String str) {
		super(str);
	}
}

public class Number2 {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		SalaryData s = new SalaryData("Harsh", 29, 10);
		Validator val = new Validator();

		double sal = val.getTotalSalary(s);
	
		System.out.println(sal);
		
	}

}
