import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedChar {

    public static int repeatChar(String str)
    {
        Set<Character> charSet = new HashSet<>();

        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);

            if(!charSet.add(c))
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

  String inputString =  "Jumanju"  ;
        int index = repeatChar(inputString);

        if (index!=-1)
            System.out.println("First Repeated Character is :- "+inputString.charAt(index)+" found at the index "+index);
        else
            System.out.println("No repeated characters found");
    }

}
