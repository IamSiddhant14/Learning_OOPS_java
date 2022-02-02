import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Refer_this_file_for_implemention{

    static String s = " Hello Siddhant ";
    public static String d = " Hello Siddhant op "; //Now this variable could also be inhereted by another class as well which is out side of this Public class 
 
    public static int S(){
        System.out.println("Hello");
        return 6;
    }

    int c = 6;//This is an data member of the public class 'Refer_this_file_for_implemention' we Cannot make a static reference to the non-static field c
    static int ca = 6;//This will work fine

    String AnotherfunctionONE(){
        System.out.println("This is an member function (private) of the public class 'Refer_this_file_for_implemention' and could be called by the objects of the class but here Cannot make a static reference to the non-static field c ");
        return " from Anotherfunction ";
    }
    static String AnotherfunctionTWO(){
        System.out.println(" This will work fine ");
        return "AnotherfunctionTWO";
    }

    public static class Classop{
        int n =  69 ;
        int b ;
        String a;

        String memberFunc(){//private by default , that is it could be accessed by all the data member & member function of the public class(Refer_this_file_for_implemention) and not outside of it
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
        System.out.println(op.a);
        // System.out.println(c);Cannot make a static reference to the non-static field c
        // System.out.println(AnotherfunctionONE());Cannot make a static reference to the non-static field c
        System.out.println(ca);
        System.out.println(AnotherfunctionTWO());

    }


}
