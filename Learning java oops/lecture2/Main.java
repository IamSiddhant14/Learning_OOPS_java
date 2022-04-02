package lecture2;

public class Main {

    //when we write static then it becames a method / variable of a class instead of being of an object 


    //we could access a static variable or a method without creating an object of the class which it belongs to .

    // class name . static property or variable name

    //we could not use this keyword inside a static method
    
    // static --> static  Y

    // non-static --> static  Y ( A STATIC VARIABLE/METHOD BECAMES A PROPERTY OF THE CLASS AND HENCE COULD BE ACCESSES BY THE OTHER OBJECTS OF THE CLASS AS WELL )

    // non-static --> non-static  Y

    // static --> non-static  N (AS WE COULD NOT USE "THIS" KEYWORD INSIDE AN STATIC METHOD )


    class  A{

        char a = 'A';

        void pr(){
            System.out.println("hello from class"+a);
        }

    }

    static class B{
 
        char b = 'B';
        
        void pri(){
            System.out.println("hello from class"+ b);
        }

        B(){
            this.b = 'c';// not possible to use 'this' inside an static method although we could use 'this' keyword inside a static class
        }

    }

    // Nested class : Here while making a nested class we need to make the inside class as static to make the the object of the inner class without creating an object of the outer class .

    public static void main(String[] args ){


        // The given below thing is possible as here we could access the  data member and member funtion of the class B without creating an object of the class B as it is Static in nature


        // B ho = new B();
        // ho.pri();

        // Below thing is not possible as here the class A is not static so first we need to create an object of the class A in order to acces its data member and member funtion

        // A hoh = new A();
        // hoh.pr();
        // System.out.println(hoh.a);

       


    }


    
}
