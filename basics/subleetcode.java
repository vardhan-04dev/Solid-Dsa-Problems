import java.util.Scanner;
public class subleetcode {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=s.nextInt();
        int kum=num;
        int val=1;
        int dai=0;
        while(num!=0){
            val=val*(num%10);
            num=num/10;
        }
        while(kum!=0){
            dai=dai+(kum%10);
            kum=kum/10;
        }
        int result=val-dai;
        System.out.println(result);
    }
}
