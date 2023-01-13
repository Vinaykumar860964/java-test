import javax.lang.model.util.ElementScanner14;
import javax.swing.plaf.synth.SynthSpinnerUI;

// leap year :-  there are two condition for leap year

// shold be divided by 4
// but should not be devided by 100


public class leap_year {
    
    public static void main(String[] args){

        int year=2010;

        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {

                    System.out.println("leap year");


                }
                else{
                    System.out.println("not a leap year
                    ");


                }

            }
            else{

                System.out.println("leap year");
            }

        }

        else{
            System.out.println("not a leap year");


        }

            
        }
    }