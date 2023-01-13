
import java.util.*;

public class Taking_input_by_user_coder_name_vinay {
    
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("ENTER THE NAME OF THE STUDENT");

        String student_name=s.next();

        System.out.println("ENTER THE FATHER NAME");

        String father =s.next();

        System.out.println(" ENTER THE MOTHER NAME");

        String mother = s.next();

        System.out.println("ENTER THE VILLAGE NAME");

        String village = s.next();

        System.out.println("ENTER PIN CODE");
        int pin=s.nextInt();

        System.out.println("ENTER THE POLICE STATION NAME");
        String psname=s.next();

        System.out.println("ENTER THE DISTRICT NAME");
        String district = s.next();

        System.out.println(" ENTER THE COLLEGE NAME");
        String college=s.next();
System.out.println("*******************************************************************");
        System.out.println("NAME : "+student_name);
        System.out.println("FATHER : "+father);
        System.out.println("MOTHER : "+mother);
    System.out.println("VILLAGE : "+village);
    System.out.println("POLICE STATION NAME : "+psname);
    System.out.println("DISTRICT NAME : "+district);
    System.out.println("COLLEGE NAME : "+college);
    System.out.println("PINCODE :"+pin);

    }
}
