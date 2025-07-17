import java.util.Scanner;
public class oddeven {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int negative=0;
        int even=0;
        int odd=0;
        int num=-1;
        while(num!=0)
        {
            num=s.nextInt();
            if(num<0)
            {
                negative=negative+num;
            }
            else if(num>0&&(num%2)==0)
            {
                even=even+num;
            }
            else{
                odd=odd+num;
            }
        }
        System.out.println(negative);
        System.out.println(even);
        System.out.println(odd);
    }
}
