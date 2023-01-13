public class leap_year_test {
    
    public static void main(String[] args) {
        

        int year=2024;

        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println("2024 is a leap year");

                }

                else{

                    System.out.println("2024 is not a leap year");
                }


            }
            else{
                System.err.println("2024 is a leap year");
            }

        }
        else
        {
            System.out.println("2024 is  a leap year");
        }
    }
}
