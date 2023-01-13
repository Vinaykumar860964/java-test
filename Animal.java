
class dog{
    public void color(){

        System.out.println("the  color of the ddog is black");

    }
}
class cat extends dog{
    public void sppeak(){

        System.out.println("cat speak like meow meow  meow meow meow meow v meow meow meow meow meow  meow .............................. ");
    }                                    
}

public class Animal {

    public static void main(String[] args) {

        cat shahnaj=new cat();
        shahnaj.color();
        shahnaj.sppeak();
    }
    
}
