import java.util.Scanner;

public class reverse_triangle { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        
        int letter = 65;

        System.out.print("Enter the values : ");

        int n = sc.nextInt();

        for(int i=n;i>=1;--i)
        {
            for(int j=1;j<=i;++j)
            {
                System.out.print((char)letter+" ");
            }
            letter++;
            System.out.println();
        }

    }
    
}
