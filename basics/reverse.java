
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        System.out.println("Enter a number to check if its a palindrome or not");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int end=num;
        int valu=0;
        while(num!=0)
        {
            int digit=num%10;
            valu=valu*10+digit;
            num=num/10;
        }
        if(end==valu)
        {
            System.out.println("Yes the number is palindrome");
        }
        else{
            System.out.println("No the number is not a palindrome");
        }
    }
    
}
