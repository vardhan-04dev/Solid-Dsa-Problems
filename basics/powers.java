import java.util.Scanner;
public class powers {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        System.out.println("Enter the power");
        int pow=s.nextInt();
        int result=1;
        for(int i=1;i<=pow;i++){
            result=result*num;
        }
        System.out.println(result);
    }
}
