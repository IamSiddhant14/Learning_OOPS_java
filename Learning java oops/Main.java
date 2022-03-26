// javac Main.java --> For Compiling   Here filename with extension is required

// java Main --> For Running    Here filename with extension is required)

// To compile  and run it in one go without creating any  .class file we will do :
// java Main.java   (Here filename with extension is required)

// If we wish to create our own data type we can do it using classes

// A class consist of a data member and member functions

public class Main {

    // 1.> For public classes filename and Class name should be same, in this file
    // "Main.java" so class name will be Main

    // 2.> There could only be one public class but there could be other class which
    // are not public in nature

    // 3.> Class name frist letter should be captial in nature( convention)

    // 4.> Here public signifience that this class could be accessed from any other
    // package any other class or any file as well

    static class Student{

        int rollNo;
        String name;
        boolean is;

        //"this "refers to the object of the class student

        Student(int rollNo , String name){ //constructor
            this.rollNo =rollNo;  //Here "this" keyword refers to object created from class Student
            this.name = name;
            this.is = true;
        }


        public Student() {// Default constructor

            // Calling one constructor from another constructor,constructor chaining
          this(13 , "op singh");
        }

        Student(Student other){//Copy constructor
          this.name = other.name;
          this.rollNo = other.rollNo;
          this.is = other.is;
        }

        void greeting(){//In void type things we don't write "println"
            System.out.println("Hello My Name is "+ this.name);
        }

        void changeName(String s){
            this.name = s;//we are changing the name of the object
        }
    }

    static class A {

        // In java garabe collection happens automatically unlike other language like
        // that of c++, but here we could instead tell what to do when object is
        // destroyed this could be done with the help of distructors

        // Here we have this finalize method in class A we could have them in different
        // classes , any object from class A is been created then finalize will get
        // called

        final int num = 10;
        String name;

       A(String name) {
            this.name = name;
        }

        @Override
        protected void finalize() throws Throwable {

            // super.finalize();
            System.out.println("Object is destroyed");
        }

    }

    public static void main(String[] args) {
        
        // Here this " String[] args "represent that it is an array of strings named as args
            
        // 1.> Here this method "main" is also static in nature as we dont require to

        // create an object of the class "Main" in order to invoke the "main" method

        // thats why it is been made as public in nature

        // 1.1> Main obj = new Main();
        // obj.main(); we dont like to do it like this way thats why

        // 2.> Here the name of this method will always be "main" (Syantx)

        // 3.> Here void is the return type of the function

        // 4.> Program is always going to start from the main function

        // 5.> Here public signifience that this method could be accessed from any other
        // package any other class or any file as well

        // ** */ System.out.println(args[0]); // To pass argument in to the main
        // function we could write it like :

        // First compile it : javac Main.java
        // Run it with arguments : java Main 3 "Siddhant"
        // Here this will go in the form of an array of type string"[ "3" , "Siddhant
        // "]"

        // Notes : Any data type which could not be broken into other data types are
        // called premitive data type like( stack mai he refrence variable banta hai) :

        // int rollos = 64;
        // char letter = 'r';
        // float marks = 98.67f;
        // double largeDecimalNumbers = 4567654.4567;
        // long largeInteger = 34567834567876543L;
        // boolean check = false;

        // Wrapper classes : Stack mai reference variable banta hai aur uska object heap
        // mai banta hai jis ko refernce variable point karta hai

        Integer rno = 13;
        Integer n = new Integer(13);

        // FROM LEARNING INTELLIJ

        // System.out.println(args[0]);
        // System.out.print("Please entre some input :");
        // Scanner scn = new Scanner(System.in);//Keyboard
        // String s = scn.next();
        // // System.out.println("Hello World : "+ args[0]); To run this: java Main.java
        // "Siddhant"
        // System.out.println("Hello World : "+ s);//Command line, display

        // Student s = new Student();// Allocating a variable at run time and returns a
        // refrence to it
        // System.out.println(s.roll);

        final int INCREASE = 2;

        // Final keyword help us in preventing our content getting modified, remember
        // final variables need to be intialized at the time of creating it, final
        // keyword is only applicable to the premitive data types only as in case of non
        // premative data type we could not reassign it although we could modifie it
        // value

        // INCREASE = 3;//This will result in an error

        // final Student s1 = new Student();
        // Student s2 = new student();
        // s1.name = "hi";
        // s1.name = "hello";// This is possible for non premitive data types to
        // reassign values
        // s1.name = kunal ; // Assianing it to another object is not allowed with final
        // keyword

        // A obj;
        // for (int i = 0; i < 1000000000; i++) {
        //     obj = new A("Random name");
        // }
    }

}
