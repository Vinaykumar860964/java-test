
public class Checking_the_leap_year_By_vinay {
    
    public static void main(String[] args) {
        
        int vinay=2014;

        if(vinay%4==0)
        {
            if(vinay%400==0)
            {

                if(vinay%100==0)
                {

                    System.out.println("2014 is a leap year");
                }
                else
                {

                    System.out.println(" 2014 is not a leap year");
                }


            }

            else
            {

                System.out.println(" 2014 is a leap year");
            }


        }
        else
        {

            System.out.println("2014 is not a leap year");
        }
    }
}
