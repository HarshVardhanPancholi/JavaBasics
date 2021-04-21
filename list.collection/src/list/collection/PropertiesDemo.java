package list.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class EmailException extends RuntimeException{
	public EmailException(String str) {
		// TODO Auto-generated constructor stub
		super(str);
	}
}

public class PropertiesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String username=null;
		String name = null;
		String password=null;
		String mobile=null;
		String email=null;
		
		FileInputStream fis=null;
		Properties p=new Properties();
		
		try
		{
			fis=new FileInputStream("src//dbdetails");
			p.load(fis);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		username=p.getProperty("username");
		password=p.getProperty("password");
		email=p.getProperty("email");
		mobile=p.getProperty("mobile");
		name= p.getProperty("name");
				
		
		System.out.println("Username : "+username);
		System.out.println("Password : "+password);
		System.out.println("Email : "+email);
		System.out.println("Mobile : "+mobile);
		System.out.println("Name : "+name);

		System.out.println("-------------------------------------");
		Scanner sc= new Scanner(System.in);
		try {
			Pattern pt =Pattern.compile("^(.+)@(.+)$");
			
			String s = sc.next();
			Matcher matcher = pt.matcher(s); 
			if(!(matcher.matches())) {
				throw new EmailException("Invalid email");
			}
			p.setProperty("email", s);
			System.out.println("NewEmail : "+p.getProperty("email"));
		}
			
		
		catch(EmailException e) {
			System.out.println(e.getMessage());
		}
		catch(NoSuchElementException e) {
			System.out.println("You need enter Email");
		}
		finally {
			sc.close();
		}
	}

}
