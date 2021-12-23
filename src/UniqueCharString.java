import java.util.HashMap;
import java.util.Map;

public class UniqueCharString {

    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";

        char[] charArray = str.toCharArray();

        Map<Character,Integer> charMap = new HashMap();

        for(char indivdualChar: charArray)
        {
            if(!charMap.containsKey(indivdualChar))
            {
                charMap.put(indivdualChar,1);
            }
            else
            {
                System.out.println("String has duplicate characters");
                break;
            }
        }
    }
}
