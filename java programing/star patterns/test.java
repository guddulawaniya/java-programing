import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class test { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int i=1;
        int a;
        double b;
        long c;
        byte d;
        String e;

        while(5>=i)
        {
             a = sc.nextInt();
           b = sc.nextDouble();
           c = sc.nextLong();
           d = sc.nextByte();
           e = sc.next();


            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(e);



           i++;
        }

          
    }
    
}
