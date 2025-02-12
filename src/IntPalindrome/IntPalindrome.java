package IntPalindrome;

import java.util.Scanner;

public class IntPalindrome{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        IntPalindrome obj=new IntPalindrome();
        System.out.println(obj.IntPal(num));;
    }
    static boolean IntPal(int num){

        if(num<0 || (num/10==0)&& num!=0){
            return false;
        }

        int reversed=0;
        int original=num;

        while(num>reversed){
            reversed=reversed*10+num%10;
            num/=10;
        }
        return num ==reversed || num==reversed/10;
    }
}
