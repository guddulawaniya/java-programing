import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        System.out.print("Enter the values to find the factorial no : ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact =1;
       int i=1;
       while(i<=n)
       {
           fact = fact*i;
           ++i;
       }

        System.out.println(fact);
    }
    
}
