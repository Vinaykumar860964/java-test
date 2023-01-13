import java.util.Scanner;

public class TakeInputByUser {
    
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name");

        String name=s.next();
    
        System.out.println("Enter the age");

        int age=s.nextInt();
        System.out.println("Enter your gender");
        char gender=s.next().charAt(0);
        System.out.println("Enter your phone number");
        long phone=s.nextLong();

        System.out.println("......................................");
        System.out.println("name :"+name);
        System.out.println("age :"+age);
        System.out.println("gender :"+gender);
        System.out.println("phone :"+phone);

    }
}
