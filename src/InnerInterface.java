/**
 * Created by narahara on 7/10/2017.
 */
interface A{
    public void met1();
}

public class InnerInterface {
    public static void main(String args[])
    {
        A obj = new A(){
            public void met1(){
                System.out.println("met1() in Anonymous class");
            }
        };

        obj.met1();
    }
}
