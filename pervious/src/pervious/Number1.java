package pervious;

import java.util.ArrayList;

class Student{
	private String name;
	private String collegeName;
	float percentage;
	float scholarship;
	
	Student(String name, String collegeName, float percentage){
		this.name=name;
		this.collegeName=collegeName;
		this.percentage=percentage;
	}

	
	public float getScholarship() {
		return scholarship;
	}


	public void setScholarship(float scholarship) {
		this.scholarship = scholarship;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	
	
}
class Portal{
	ArrayList<Student> studentList = new ArrayList<Student>(); 
	void assignScholarship() {
		for(Student s: studentList) {
		float p = s.getPercentage();
		if(p>=91) {
			s.setScholarship(10000f);
		}
		else if(p>=81) {
			s.setScholarship(5000f);
		}
		else {
			s.setScholarship(0);
		}}
	}
	float totalScholarship() {
		float tot=0f;
		for(Student s: studentList) {
			tot=tot+s.getScholarship();
		}
		return tot;
	}
	String totalMaxScholarshipOfCollege() {
		String temp="";
		float tmp=0;
		for(Student s : studentList) {
			if(s.getPercentage()>tmp) {
				tmp= s.getPercentage();
				temp=s.getCollegeName();
			}
			
		}
		return temp;
	}
}

public class Number1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Portal obj = new Portal();
		obj.studentList.add(new Student("Harsh", "JECRC",82));
		obj.studentList.add(new Student("Ritu", "NIT",98));
		obj.studentList.add(new Student("Aditya", "IIIT",90));
		obj.studentList.add(new Student("Amit", "PIT",70));
		obj.assignScholarship();
		System.out.println(obj.totalScholarship());
		System.out.println(obj.totalMaxScholarshipOfCollege());
	}

}
