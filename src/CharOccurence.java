import java.util.HashMap;
import java.util.Map;

public class CharOccurence {

    static void charCount(String str)
    {
        HashMap<Character,Integer> charMap = new HashMap<Character,Integer>();

        char[] charArray = str.toCharArray();

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
       for(Map.Entry entry:charMap.entrySet())
       {
           System.out.println(entry.getKey()+" "+entry.getValue());
       }

    }

    public static void main(String[] args) {
        String str = "JAVA";
        charCount(str);

    }
}
