//To run this file in terminal or gitbash just write : java <-filename->.java


import java.util.*; //This will have all the opertions like that of print ,etc, etc
import java.io.*;//This is rquired for input output operation

public class op{ //When we have a public class then the class name should be same as the file name

    static int n = 2; //Here this will behave an global variable that is it could be exceed from all the function which is present in that class
    public static void main(String[] args) {  

        System.out.println("Hi from java from program 1");
        hi();  // All functions written in the class must be called in this main function only and no where else

    }

    public static void hi() {

        System.out.println("hello ");
        System.out.println(n);
        
    }

    
    public static void hhoisdfh() {//all, on running once only memory is been assiigned

        System.out.println("hello ");
        System.out.println(n);
        
    }

    // static void hhoisdfh() {//private that is having existance  in this class only

    //     System.out.println("hello ");
    //     System.out.println(n);
        
    // }

}


// class o{//If we dont write "public" in front of class name then we could create name of class as per our needs and not same as the file name as before

//     public static int n = 2;
//     public static void main(String[] args) {

//         System.out.println("Hi from java from program 2");
//         hi();

//     }

//     public static void hi() {

//         System.out.println("hello ");
//         System.out.println(n);

//     }

// }