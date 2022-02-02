//To run this file in terminal or gitbash just write : javac <-filename->.java   (This will only work when the file name and the public class name is same )

//An IDE consist of both editor and compiler
//An jdk(Java development kit) is been used to to compile and run a java program

//If the file name and the class name are same

//For compiling - javac <-- filename.java --/>

import java.util.*; //This will have all the opertions like that of print ,etc, etc
import java.io.*;//This is rquired for input output operation

public class op{ //When we have a public class then the class name should be same as the file name,every file should have an public class that to only one public class but it could have multiple classes other than public class .
   public static class abc{

        void ab(){ // Private by default
        System.out.println("Hello aditya");
       }

   }
   public static int n = 69; //Here this will behave as an local variable , that is it could be exceed from all the function which is present in that class
    public static void main(String[] args) {  

        System.out.println("Hi from java from main function");
        hi0();  // All functions written in the class must be called in this main function only and no where else
        hi1();
        hi2();

        abc obij = new abc();
        obij.ab();
        System.out.println(n);
    }
    

    public static void hi0() {// Here all functions will be of type static because we could only access them by our main function if they are of type static
        //That is an staic function could only called by an static function or an static class

        System.out.println("Hello from hi()");
        System.out.println(n);
        
    }

    
    public static void hi1() {//all, on running once only memory is been assiigned

        System.out.println("Hello from public hi1()");
        System.out.println(n);
        
    }

    static void hi2() {//private that is having existance in this class only

        System.out.println("Hello from static hi2()");
        System.out.println(n);
        
    }

}

//REFFER THIS 

//https://zoom.us/rec/play/31N2bK36Ljg4ycpYumbwqaJG9wQ0dI_Mo_sWmULLwEHSDQZ8xgPZobGaAvSwoiGjYo2diNgV3J4kbD2U.EH9rs_v29VTBj3Q3?continueMode=true&_x_zm_rtaid=mCLAPnYxTfa8MaX6DfO36w.1643570106035.1367397f1c5250b3cd6668307d9a2b59&_x_zm_rhtaid=422

//while compiling the name could be diffrent but while running the class name should be same as the class actuale name or it will result in an run time error

//If the file name and the class name are DIFFRENT

//For compiling - javac <-- filename.java --/>
//For running - java <-- class Name --/>

// class o{//If we dont write "public" in front of class name then we could create name of class as per our needs and not same as the file name as before AND also this will create a new file named as <--className.class-->

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


//		try {

//			System.out.println(2/0);

//		} catch(ArrayIndexOutOfBoundsException e) {

//			System.out.println("Error aaya tha");
//			System.out.println(e.getLocalizedMessage());

//		} catch(ArithmeticException e) {
//			
//		} catch(Exception e){

//      }


//A class is an user defined data type , where each object created from the class is an instance of that class,


//Syantx to make a class,

//public static class <--classname-->{

        // Data memebers
        //   DATATYPE  NAME



        //Members Functions
        //   ReturnType FunctionName{

        // }

//}

// public static class LinkedList {

//     Node head; -- This three of them are data members
//     Node tail;
//     int size;
//     void addLast(int val) { -- This is an memeber function

//     }

// }



//Array shallow copy and deep copy

// int [] a = {1,2,3,4,5,6};
// int [] b = new int [a.length];


// Here we have used this "new" keyword which help us in creating an new copy ,but if we would have not used "new" keyword in that case a shallow copy would have been created , because of which any change made on array "b" will refelect in array "a " as well

// for (int i = 0; a.length; i++){
//     b[i] = a[i];
// }
          

//Scanner scn = new Scanner (System.in);
// Here it an user defined-data-type(class) "scanner" we have created an object as "scn" that is, "scn" is an instance of class "scanner"


// object bina bina call kar skte hai ek method if it is type static


// when the function is of type private instead of being public then that function could be called only within the class and not outside of that class








