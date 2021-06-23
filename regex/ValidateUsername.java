import java.util.Scanner;
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
