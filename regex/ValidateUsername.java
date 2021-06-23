import java.util.Scanner;
/***********************Conditions*********************/
/*
===>The username consists of  to  characters inclusive.
    If the username consists of less than  or greater than  characters,
    then it is an invalid username.
===>The username can only contain alphanumeric characters and underscores (_).
    Alphanumeric characters describe the character set consisting of lowercase characters ,
    uppercase characters , and digits .
===>The first character of the username must be an alphabetic character,
    i.e., either lowercase character  or uppercase character .
 */

class UsernameValidator {
    public static final String regex = "^[a-zA-Z]([a-zA-Z0-9_]){7,19}";
}
public class ValidateUsername { 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();
            System.out.println(userName.matches(UsernameValidator.regex)?:"Valid":"Invalid");          
        }
        scan.close();
    }
}
