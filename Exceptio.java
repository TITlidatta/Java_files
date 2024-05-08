class OurownException extends Exception
{
    OurownException(String s)
    {
        super(s);
    }
    // jehetu amra Exception type er objects ke as a text message show kori situation take define kore 
    //tai Exception class ei toString() method ta already description deoa ace 
    // tai directly kno message nie otake OurownException er parent class Exception class e super(s) kore send kore dilm 
}



public class Exceptio {

    public static void main(String args[])
    {
       // We are only dealing with Runtime errors
       // All Runtime errors are represented as objects belonging to Throwable class
       // Throwable class has two child class Exception and Error
       // Exception class are used to create objects which represent logical errors condition at runtime
       // Error class is used to create objects which represent System failure at runtime

       // There are predefined childclasses of Exception class for different common known logical errors at runtime
       // like ArrayIndexOutOfBoundsException
       // like ArithmeticException
       //like FileNotFoundException
       // All these child classes are predefined but if we want we can define our own childclass of Exception class 
       //to handle any specific logical error situation.
       // Java itself cannot throw objects of these userdefined child classes
       // so we explicitely have to tell the Jvm to throw that object in the try block

       // Among all these predefined childclasses of Exception class some are checked at compile time by compiler 
       // for example FileNotFoundException is such an example ------this type of Exception child classes are known as checked error

       // for these checked Exceptions we need to predeclare in any function using throws keyword


       int x =0;
       int y=7;
       try
       {
           System.out.println(y/x);
           // mind it amader alada kore ArithmeticException throw krte hoini java niejei situation ta handle krte na pere throw 
           // kore debe
       }
       catch(ArithmeticException e)
       {
            System.out.println(e);
       }
       finally
       {
          // for rest part of code upon successful catching of execption

          System.out.println("Hello");
          System.out.println("Hi");
          System.out.println("GudiGudi");
       }
       
       // to implement any situation which is not common ar jar jno kono class internally define kora nei
       try{
            
            int xx = 23;
            int yy=90;
            if(yy-xx<0)
            {
                OurownException e = new OurownException("Negative value");
                throw e;
            }
            else
            { System.out.println("ok");}
       }
       catch(OurownException e)
       {
         
             System.out.println(e);
       }
     
       


    /// example of checked Exception
    /*
      public static void main() throws FileNotFoundException
      {
          try 
          {
             CODE ;;;;;
          }
          catch(FileNotFoundException e)
          {
                    System.out.println(e);
          }
      }
     */
    }
    
}
