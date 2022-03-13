// javac Main.java --> For Compiling   Here filename with extension is required)
// java Main --> For Running    Here filename with extension is required)

//To compile  and run it in one go without creating any  .class file we will do :
// java Main.java   (Here filename with extension is required)





public class Main{
    
    // 1.> For public classes filename and Class name should be same, in this file "Main.java" 
    
    // 2.> There could only be one public class but there could be other class which are not public in nature

    // 3.>  Class name frist letter should be captial in nature( convention)

    //4.> Here public signifience that this class could be accessed from any other package any other class or any file as well


    public static void main( String[] args){// Here this " String[] args "represent that it is an array of string named as args 
        
        // 1.> Here this method "main" is also public in nature as we dont require to create an object of the class "Main" in order to invoke the "main" method thats why it is been made as public in nature
        
        // 2.> Here the name of this method will always be "main" (Syantx)

        // 3.> Here void is the return type of the function

        System.out.println(args[0]); // To pass argument in to the main function we could write it like : 

        //First compile it : javac Main.java
        //Run it with arguments : java Main 3 "Siddhant"
        //Here this will go in the form of an array of type string"[ "3" , "Siddhant "]"

    }
}