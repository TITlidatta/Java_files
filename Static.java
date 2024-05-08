class Cuteness
{
    String chasma;
    String name;
    static String jamarcolor="IEM_UNIFORM";// fixed for all objects of Cuteness class mane prottek object 
                                                  //of this class will have only one copy of this variable . 
                                                  // ekta object er value change krle erektai o effect asbe 
    public void sleep()
    {
        System.out.println("I am sleeping");
    }
}


// static is a keyword 

public class Static {
    public static void main(String args[])
    {
        Cuteness x = new Cuteness();
        Cuteness y = new Cuteness();
        x.name="Rahul";
        x.chasma="Black";
        y.name="Suvadip";
        y.chasma="Metal";
        System.out.println(x.name);
        System.out.println(y.name);
        System.out.println(Cuteness.jamarcolor);
        Cuteness.jamarcolor="UEM_UNIFORM";
        System.out.println(Cuteness.jamarcolor);
    }
    
}


