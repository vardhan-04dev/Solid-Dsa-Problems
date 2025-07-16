import java.util.Scanner;
public class factors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number u want to find the factors of");
        int num=s.nextInt();
        double sqrt=Math.sqrt(num);
        for(int i=1;i<=sqrt;i++)
        {
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
}
