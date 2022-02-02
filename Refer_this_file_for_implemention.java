import java.util.*;
import java.util.Scanner;

public class Refer_this_file_for_implemention{

    static String s = " Hello Siddhant ";
    public static String d = " Hello Siddhant op "; //Now this function could also be inhereted by another class as well
 
    public static int S(){
        System.out.println("Hello");
        return 6;
    }

    public static class Classop{
        int n =  69 ;
        int b ;
        String a;

        String memberFunc(){
            System.out.println("Hello worldddddddddddd");

            return "op Siddhant OP";
        }
    }


    public static void main(String [] args ){

        //All the function/class/ variables should of type static in order to call that function or class or variables from this main function 

        System.out.println(s);
        System.out.println(S());
        Classop op = new Classop();
        op.memberFunc();
        System.out.println(op.n);
        System.out.println(op.b);

    }


}