package TwentyFourthJuly;

import java.util.ArrayList;
import java.util.List;

public class Q_Five {
    public static void main(String[] args)
    {

        String sentence= "HEllo We Are Learnig Java Enterprise Course".replaceAll("\\s","");

         List<String> result=new ArrayList<String>();

        // iterating over each chara int the sentence
        for(int i=0;i<sentence.length()-1; i++)
        {
            int count=0;
            // to count repeating words
            for (int j=i+1;j<sentence.length();j++)
            {
                if( sentence.charAt(i) == sentence.charAt(j))
                {

                    count++;
                }
            }
            if (count >1)
                result.add(sentence.charAt(i)+" repeats "+ count +" times");
        }
        for (String s: result)
        {
            System.out.println(s);
        }
    }
}