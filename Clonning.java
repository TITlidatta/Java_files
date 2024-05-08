
class Demo implements Cloneable 
{
    int i;
    int j;

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();

    }
    // this clone method is an internal method of java present inside an internal interface named Clonable
    // tai Demo class Clonable interface ke implement kore clone method er description diyece
    // clone method ta ekta checked exception dei  CloneNotSupportedException tai otake bole dite holo using throws keyword 
}


public class Clonning {
    public static void main(String args[]) throws CloneNotSupportedException
    {
         Demo obj1 = new Demo();
         obj1.i=5;
         obj1.j=4;
         Demo obj2 = (Demo) obj1.clone();  // to use this clone function we have to define it in the Demo class
         System.out.println(obj2.i);
    }
    
}
