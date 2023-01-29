package TwentyFourthJuly;

public class AssignFirstQone
{
    public static void main(String[] args)
        {
            PrintInueronWord(5);
            System.out.println();
        }
    static void PrintInueronWord( int n)
    {
        for (int r=1;r<=n;r++)
        {

            for (int cl=1;cl<=2;cl++)
            {
                if (cl==0 || cl==n-1 || cl==(n-1)/2 )
                    System.out.print("*");
                else
                    System.out.print("");
            }
            System.out.print ("  "); // Space between charater  // I LETTER

           ///////////////
            for (int clm=1;clm <=n;clm++)
            {
                if  (clm ==1 || clm == r || clm == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("   "); // Space between charater // N LETTER

            ///////////////

            for (int cl=1;cl<=n;cl++)
            {
                if ( r ==1 || r==(n+1)/2 || r==n  || cl==1 )
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.print ("  "); // Space between charater // E LETTER

            ///////////////

            for (int cl=1;cl<=n;cl++)
            {
                if ( (cl == 1 && r !=n) || (r==n && cl !=1 && cl !=n ) || (cl == n && r !=n  )   )
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.print ("  "); // Space between charater // U LETTER

            ///////////////

            for (int cl=1;cl<=n;cl++)
            {
                if ( ( cl ==1) || (r == 1 && cl != 5 )  ||  (r == (n+1) /2 && cl != 5)  ||
                        (r==(n-1)/2 && cl==n) ||  (r-cl == 1))
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.print ("  "); // Space between charater // R LETTER

            ///////////////

            for (int cl=1;cl<=n;cl++)
            {
                if (    (r == 1 && cl != 1 && cl!=n)  || (r ==n && cl !=1 && cl !=n)  ||
                        (cl == 1 && r !=1 && r !=n) || (cl ==n && r !=1 && r !=n)      )
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.print ("  "); // Space between charater // O LETTER

            ///////////////

            for (int clm=1;clm <=n;clm++)
            {
                if  (clm ==1 || clm == r || clm == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("   "); // Space between charater // N LETTER

            ///////////////
            System.out.println(); // new line
        }
    }
}