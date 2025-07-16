import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        System.out.print("Enter number ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int result=num;
        for(int i=1;i<num;i++)
        {
            result=result*(num-i);
        }
        System.out.println(result);
    }
    
}
