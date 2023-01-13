public class FindTheLeapYear {
    
    public static void main(String[] args) {
        

        int year=2044;

        if(year%4==0){

            if(year%400==0){

                if(year%100==0){

                    System.out.println("2040 is a leap year ");

                }
                else{

                    System.out.println("2040 is not a leap year");
                }


            }
            else{
                System.out.println("2040 is a leap year");
            }


        }
        else{
            System.out.println("2040 is not a leap year");
        }
    }
}
