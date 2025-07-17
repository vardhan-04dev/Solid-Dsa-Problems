import java.util.Scanner;
public class Ncr {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the numbers respectively N&R");
        int N=s.nextInt();
        int R=s.nextInt();
        int divi=N-R;
        int result_N=1;
        int result_R=1;
        for(int i=0;i<N;i++)
        {
            result_N=result_N*(N-i);
        }
        for(int j=0;j<divi;j++)
        {
            result_R=result_R*(divi-j);
        }
        int NCR=(result_N/result_R);
        System.out.println(NCR);
        
        
    }
}
