
import java.util.Arrays;
// This Arrays class has many functions defined inside it which are static in natutre Arrays.func();
// sort(); 
public class Array_String_CommandLine {

    public static void main(String args[])  // every string object belongs to class String  java.lang 
    {
       //args[0];
       //args[1];


       int[] arr = new int[3];
       arr[0]=45;
       arr[1]=22;
       arr[2]=25;
       System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
       Arrays.sort(arr);
       //Arrays.func(arr);
       System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);

       // functions present in String class = charAt();    String x = "Hello"   x.charAt(3) = l    x.concat()
       // StringBuilder----> the objects of this class can be resizable 
       // String class er object gulo ke resize krte gele purono ke rejecr kore natun memory abr banai die abr otar nam x die dei 
    

    }
    // Object  java.lang   all arrays are object of this class called Object
}
