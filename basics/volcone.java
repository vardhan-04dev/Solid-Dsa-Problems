import java.util.Scanner;
public class volcone {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter radius of cone");
        int r=s.nextInt();
        System.out.println("Enter height of the cone");
        int h=s.nextInt();

        double vol=(1.0/3)*(3.14)*r*r*h;
        System.out.println(vol);

    }
}
