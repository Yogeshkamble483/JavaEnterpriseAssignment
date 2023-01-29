package TwentyFourthJuly;

public class Q_Seven
{
    public static void main(String[] args)
    {
        String name = "I Neuron Enterprise Java";


        int vowels = 0;
        int consonants = 0;

        String str = name.replaceAll("\\s", "");
        for (int i = 0; i < str.length(); i++)
        {

            char ch = str.charAt(i);
            if ((int) ch >= 65 && (int) ch >= 65)
            {
                if (ch == 'a' ||
                        ch == 'A' ||
                        ch == 'e' ||
                        ch == 'E' ||
                        ch == 'I' ||
                        ch == 'i' ||
                        ch == 'o' ||
                        ch == 'O' ||
                        ch == 'u' ||
                        ch == 'U')
                {
                    vowels++;
                } else
                    consonants++;
            }
        }
        System.out.println("======== Result ========" );
        System.out.println("Total Vowels is =  " + vowels );
        System.out.println("Total Consonants is = "  + consonants);

    }
}