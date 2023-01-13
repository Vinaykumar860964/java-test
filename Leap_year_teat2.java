public class Leap_year_teat2 {
    
    public static void main(String[] args) {
        
        int year=2028;

        if(year%4==0)
        {
            if(year%100==0)
            {

                if(year%400==0){

                    System.out.println("2028 is a leap year");
                }
                else{
                    System.out.println("2028 is not a leap year");
                }


            }
            else{
                System.out.println("2028 is a leap year");
            }

        }
        else{
            System.out.println("2028 is not a leap year");
        }
    }
}
