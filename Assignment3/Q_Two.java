package TwentyFourthJuly;

public class Q_Two
{
    public static void main(String[] args)
    {
        String str = "Think Twice";
        String result = "";

        String[] arr = str.split(" ");

        for (int i = arr.length - 1; i >= 0; i--)
        {
            result = result + arr[i] + " ";
        }
        char[] ch = result.toCharArray();

        String FinalResult = "";
        for (int i = ch.length - 1; i >= 0; i--)
        {
            FinalResult = FinalResult + ch[i];
        }
        System.out.println(FinalResult);

    }
}