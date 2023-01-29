package TwentyFourthJuly;

import java.util.Scanner;

public class Q_one_reverse {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string :");
        String str = sc.nextLine();

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--)
        {
            result = result + str.charAt(i);
        }
        System.out.println("The Reserve string Result  is  : " + result);
    }
}