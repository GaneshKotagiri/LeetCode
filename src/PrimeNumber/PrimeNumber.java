package PrimeNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[ ] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int N=sc.nextInt();

        BigInteger num=new BigInteger(String.valueOf(N));

        if (num.isProbablePrime(100)){
            System.out.println(N+ " is a prime number");
        }
        else{
            System.out.println(N+" is NOT a prime number");
        }

    }
}
