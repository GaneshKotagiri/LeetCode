package RomanToInteger;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Roman Number: ");
        String roman=sc.nextLine().toUpperCase();

        if(!isRoman(roman)){
            System.out.println("The Entered Value is not a Roman Number!");
        }else{
            RomanToInteger obj=new RomanToInteger();
            System.out.println(obj.RomToInt(roman));
        }
    }
    public int RomToInt(String s){
        HashMap<Character,Integer> map= new HashMap<>();
        map.put('I',1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L',50);
        map.put('C',100);
        map.put('D', 500);
        map.put('M', 1000);

        int previous =0;
        int total=0;

        for(int i=s.length()-1;i>=0;i--){
            int current=map.get(s.charAt(i));

            if (current<previous){
                total -= current;
            }else{
                total += current;
            }
            previous=current;
        }
        return total;
    }
    public static boolean isRoman(String s){
        return s.matches("[IVXLCDM]+");
    }
}
