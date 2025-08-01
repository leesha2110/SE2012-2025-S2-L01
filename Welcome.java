import java.util.Scanner;

public class Welcome{
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

       System.out.print("Enter your First Name:");
       String name1 = scanner.nextLine();
       System.out.print("Enter your Last line:");
       String name2 = scanner.nextLine();
       System.out.println("Welcome to the Second year" +" "+ name1 + " " + name2);
      
    scanner.close();
      }
}