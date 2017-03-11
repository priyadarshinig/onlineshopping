import java.util.*;
public class sampledate3
{
    public static void main(String[] args)
    {
        Date d1 = new Date(97, 10, 27);
        Date d2 = new Date(97, 6, 12);
        int comparison = d1.compareTo(d2);    // d1 > d2
        int comparison2 = d2.compareTo(d1);   // d2 > d1
        int comparison3 = d1.compareTo(d1);   // d1 = d1

        System.out.println("d1 > d2 : " + comparison);
        System.out.println("d1 < d2 : " + comparison2);
        System.out.println("d1 = d1 : " + comparison3);
        System.out.println("");
 
       
        boolean r1 = d1.equals(d2);
        System.out.println("Result of equal() r1 : " + r1);
 
        boolean r2 = d1.equals(d1);
        System.out.println("Result of equal() r2 : " + r2);
        System.out.println("");
 
 
        long count1 = d1.getTime();
        long count2 = d1.getTime();
        System.out.println("Milliseconds of d1 : " + count1);
        System.out.println("Milliseconds of d2 : " + count2);
    }
}

