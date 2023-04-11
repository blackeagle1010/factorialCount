import java.util.Scanner;

public class factorialCount {
    public static void main (String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number for factorial count:");
        long N= scan.nextLong();
        long total=1;
        for (long i=1; i<=N; i++){
            total *=i;
        }
        System.out.println(N+".factorial count is:"+total);
    }

}
