import java.util.Scanner;
public class fibonaci {
    public static void main(String[] args) {
        System.out.println("Tell no of terms u want");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int firstterm=0;
        int secondterm=1;
        int thirdterm=0;
        
        for(int i=0;i<n;i++)
        {
            thirdterm=firstterm+secondterm;
            System.out.print(firstterm+",");
            firstterm=secondterm;
            secondterm=thirdterm;
            
        }
    }
}
