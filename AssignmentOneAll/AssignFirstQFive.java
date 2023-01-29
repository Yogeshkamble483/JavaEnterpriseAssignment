package TwentyFourthJuly;

public class AssignFirstQFive
{
    public static void main(String[] args)
    {
        int n=7;
        for (int i=1;i<=(2*n);i++)
        {
            for (int j=1;j<=(2*n);j++)
            {
                if ( ( i + j <= n+1) || (i - j >= n-1) || (i ==1) || (i == 2 *n)
                )
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}