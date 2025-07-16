import java.util.Scanner;
public class inputillzero {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter inputs");
        int i=-1;
        int result=0;
        while(i!=0){
            i=s.nextInt();
            
            result=result+i;
        }
        System.out.println(result);
    }
}
