package TwentyFourthJuly;

import java.util.HashSet;

public class Q_Four {
    public static void main(String args[]) {

        String str = "inueron";

        str = str.toLowerCase().replaceAll(" ","");

        char[] array = str.toCharArray();

        HashSet<Character> set = new HashSet<>();
        for(int i=0 ;i<array.length;i++)
        {
            set.add((char)i);
        }
        if(set.size() == 26)
            System.out.println("String is Pangram");
        else
            System.out.println("String is NOT Pangram");
    }
}