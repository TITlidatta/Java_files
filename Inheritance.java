

//behavior functions  

// Class , Interface 

/*{
    // feature 
    // function with prpoer definition ace
}*/


/*{
    //functions without any features ;
    // function gulor definition deoa nei; 
}*/

class Parent
{
    String chasma;
    protected String name;
     public void func1()
     {
        System.out.println("Inside Parents func1");
     }
}

// private only within that class
// protected within the class or its child class
// public anywhere outiside world inside Mars
// default anywhere but within the same package 


class Childdclass extends Parent
{
    Childdclass(String a , String b)
    {
        super.name=b;
        super.chasma=a;
    }
    public void func2()
    {
        System.out.println("Inside child func2");
    }

    public void func1()
    {
        System.out.println("Inside childclass func1");
    }

    //super.chasma;
    //super.func1();
    // Method Overiding 

}
class Childclass2 extends Parent
{
      Childclass2()
      {
        System.out.println("Creating object of childclass2");
      }
}
public class Inheritance {
    public static void main(String args[])
    {
       Parent x = new Childdclass("black","Suvadip"); // Dynamic Memory Dispatch 
       // Compiler checks whether the function is present in parent class or not---- yes func1 is present in parent class
       // runtime func1 will be called but according to the description given in Childclass 
       x= new Childclass2();
       x.func1();

    }
}

// class Animal 
//class Dog class Cat 
// Animal x = new Dog();
//x= new Cat();
