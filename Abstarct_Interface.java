interface Inter1
{
    public void funcx();// I donot need to mention this function is abstarct 
    // If i also give any feature I dont have to mention it to be final it is by deafault known that
    // any feature within interface is final .
    public void  funcy();
}

interface Inter2
{
    public void funcw();

    default public void functionx()
    {
        System.out.println("Hi");
    }
}

abstract class Suvo
{
    final String feature1="Suneha"; // I need to mention this is final ---> final mane constant variable jar value whole code e 
                                                                                         // kothao change hbe na;
    abstract public void functiony(); // I need to mention this is abstract

}

// normal Parent jeta kina abstract noi sei parent class er direct object banate pari
// parent er child class ero object banate pari 
// x = new Childclass();
// x = new Parent();
// I cannot write write x = new Parent() if parent was abstract class
// x= new Childclass();

//Parent x = new Childclass();



class Childclass implements Inter1, Inter2
{
    public void func2()
    {
        System.out.println("Inside child func2");
    }
    public void funcx()
    {
        System.out.println("Inside Childs funcx");
    }

    public void funcy()
    {
        System.out.println("Inside Childs funcy");
    }

    public void funcw()
    {
        System.out.println("Inside Childs funcw");
    }
}

class Abstract_Interface
{
    public static void main(String args[])
    {


    }
}