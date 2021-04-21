package newproject;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) throws EmployeeTooYoungException, InvalidNameException, InvalidSalaryException{
		// TODO Auto-generated method stub
		try{
			Employee h= new Employee(100, "Harsh", "Pancholi", LocalDate.of(1997, 12, 8), 1200000);
			System.out.println(h.toString());
			System.out.println(h.getDateOfBirth());
			System.out.println("----------------------------------");
			h.setDateOfBirth(LocalDate.of(2020, 12, 8));
			System.out.println(h.getDateOfBirth());
			System.out.println("----------------------------------");
			h.setFirstName("");
			System.out.println("----------------------------------");
			h.setLastName("");
			System.out.println("----------------------------------");
			h.setSalary(900);
			System.out.println("----------------------------------");
		}
		catch(EmployeeTooYoungException e) {
			System.out.println(e.getMessage());
		}
		catch(InvalidNameException e) {
			System.out.println(e.getMessage());
		}
		catch(InvalidSalaryException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
