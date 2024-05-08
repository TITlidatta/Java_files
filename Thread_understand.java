// Thread 
// Runnable interface Thread class implement kore 


class Codeblock1 implements Runnable
{
    public void run()
    {
        for(int i =0;i<5;i++)
        {
            System.out.println("Inside Codeblock1");
        }

    }

} 


class Codeblock2  extends Thread
{
  public void run()
  {
    for(int i =0;i<5;i++)
    {
        System.out.println("Inside Codeblock2");
    }
      
  }
}


public class Thread_understand {

    public static void main(String args[])
    {
        Thread C1 = new Thread(new Codeblock1());
        Thread C2 = new Codeblock2();
        
        C1.start();
        C2.start();

        System.out.println("Inside main thread");
        // yield() join()
        // stop()
        // suspend()
        // resume()

        //Main thread 5 default proirity

       //Garbage Collector  -----> Demon Thread 
       // finalize()
       //{    ses icce   }
      /**
       * 
       * class A
       * {
       * 
       *     finalize()
       *    {   ses icce 
       *     }
       * }
       */
       // tufgjvhbfoijlkrmf

    }
    
}
