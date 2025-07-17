import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number u want to check");
        int num=s.nextInt();
        int check=num;
        int result=0;
        while(num!=0)
        {
            int x=num%10;
            result=result+(x*x*x*x);
            num=num/10;
        }
        if(result==check){
        System.out.println("Yes its an armstrong number");
    }
    else{
        System.out.println("Not an armstrong number");
    }
}}
