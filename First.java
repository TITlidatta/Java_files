class Institution
{
    String name;
    int year;
    Institution()
    {
        System.out.println("Deko vai object banacci");
    }
    Institution(String xx,int yy)
    {
         name=xx;
         year=yy;
    }
    public void santona()
    {
        System.out.println("Ha baba nao kicu kori");
    }
}


public class First {
    public static void main(String args[])
    { 
       
     Institution x= new Institution();
     Institution y= new Institution("UEM",2026);
     x.name="IEM";
     x.year=2000;
    y.santona();
   
    }
}



// class, object, method overloading,constructor