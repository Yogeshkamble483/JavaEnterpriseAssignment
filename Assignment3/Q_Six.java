package TwentyFourthJuly;

public class Q_Six
{
    public static void main(String[] args)
    {
            String str = "Java Enterprise Java With Spring Boot Course";
            char[] ch = str.toCharArray();
            System.out.println("The string is : " + str);

            System.out.print("Duplicate Letters are = : ");
            for (int i = 0; i < str.length(); i++)
            {
                for (int j = i + 1; j < str.length(); j++)
                {
                    if (ch[i] == ch[j])
                    {
                        System.out.print(ch[j] + " ");
                        break;
                    }
                }
            }
    }
}