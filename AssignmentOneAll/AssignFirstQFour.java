package TwentyFourthJuly;

public class AssignFirstQFour
{
    public static void main(String[] args)
    {
        int n=7;
        for (int i=1;i<=(2*n);i++)
        {
            for (int j=1;j<=(2*n);j++)
            {
                if( ( i - j >=6 ) || ( i + j >= 21)
                )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}