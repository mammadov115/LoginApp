import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        String username,password;
        String usr="Java",pass = "12345";
        Scanner input = new Scanner(System.in);

        System.out.println("Enter username:");
        username = input.nextLine();

        System.out.println("Enter password:");
        password = input.nextLine();

        if(username.equals(usr) && password.equals(pass)){
            System.out.println("Logged in");
        }else{
            System.out.println("Failure");
        }




    }
}
