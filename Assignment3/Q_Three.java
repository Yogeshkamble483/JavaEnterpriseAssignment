package TwentyFourthJuly;

import java.util.Arrays;
import java.util.Scanner;

public class Q_Three {

    public static void main(String args[]) {
        String str1, str2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First String");
        str1 = sc.nextLine();

        System.out.println("Enter the Second String");
        str2 = sc.nextLine();

        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        if (String.valueOf(array1).equals(String.valueOf(array2)))
            System.out.println("First and Secound String are Anagram .");
        else
            System.out.println("String Are Not Anagram .");
    }
}