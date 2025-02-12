import java.util.Scanner;
public class MathTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int N=sc.nextInt();

        for (int i=1; i<=10;i++){
            int sum =N*i;
            System.out.println( N + "*" + i+ "="+ sum);
        }
    }

}

