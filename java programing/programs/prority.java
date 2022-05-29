import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class prority { 
    public static void main(String[] args) {
    int n;  
    Scanner sc=new Scanner(System.in);  

    System.out.print("Enter the Total number Process :  ");  

    //reading the number of elements from the that we want to enter  
    n=sc.nextInt();  
    //creates an array in the memory of length 10  
    int[] process = new int[10];  
    int[] Beast = new int[10];  
    int[] arrival = new int[10];  
    int[] prority = new int[10];  

    System.out.print("Enter the Processes : ");  

    for(int i=1; i<=n; i++)  
    {   
        process[i]=sc.nextInt();  
    }  
    System.out.print("Enter the Arrival value : ");  

    for(int i=1; i<=n; i++)  
    {   
        arrival[i]=sc.nextInt();  
    }  
    System.out.print("Enter the Beast time : ");  

    for(int i=1; i<=n; i++)  
    {   
        Beast[i]=sc.nextInt();  
    }  

    System.out.print("Enter the prority value : ");
    for(int i=1; i<=n; i++)  
    {   
        prority[i]=sc.nextInt();  
    }  



    System.out.println("\nProcess\tArrival\tBeast\tPrority\tcomplete\tTAT\twaiting\trespons");  
    

        for (int i=1; i<=n; i++)   
        {  
        System.out.println("  P"+process[i]+"\t  "+arrival[i]+"\t "+Beast[i]+"\t  "+prority[i]);  
        }  
    
        for(int i=1;i<n;++i)
        {
        
            for(int j=i+1;j<=n;++j)
            {
                if(process[i]>process[j])
                {
                    int temp = 
                }
                
            }
        }
    }  


}
    
