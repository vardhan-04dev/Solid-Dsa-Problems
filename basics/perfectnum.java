import java.util.Scanner;
public class perfectnum {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();
        int ans=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                ans=ans+i;
            }
        }
        if(ans==num)
        {
            System.out.println("Its a perfect number!");
        }
        else{
            System.out.println("Its not a perfect number");
        }
    }
}
