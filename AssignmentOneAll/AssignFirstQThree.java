package TwentyFourthJuly;
public class AssignFirstQThree
{
    public static void main(String[] args)
    {
        int n=7;
        for (int i=1;i<=(2*n);i++) //outer loop
        {
            for (int j=1;j<=(2*n);j++)   //InnerLoop
            {
                if( ( i+j <= n+1 ) || (j -i >=n) ||
                        (i == 2*n) || (j == 1) || (j == 2*n)
                )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
