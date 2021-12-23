import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;

public class MaximumOccuringCharProgram {

    public static void maxCharOccur(String str)
    {
        char[] charArray = str.toCharArray();
        HashMap<Character,Integer> charMap = new HashMap<>();

        for(char c: charArray)
        {
            if(!charMap.containsKey(c))
            {
                charMap.put(c,1);
            }
            else
            {
                charMap.put(c,charMap.get(c)+1);
            }
        }
        Set<Entry<Character,Integer>> entrySet = charMap.entrySet();

        int maxCount = 0;
        char maxChar=0;

        for(Entry<Character,Integer> entry: charMap.entrySet())
        {
            if(entry.getValue() > maxCount)
            {
                maxCount = entry.getValue();

                maxChar = entry.getKey();
            }
        }
        System.out.println("The character "+maxChar+" is maximum occured "+maxCount);
    }

    public static void main(String[] args) {
        maxCharOccur("CHENNAI");
    }
}
