import java.util.Locale;

public class PangramString {

    // Function to check if a string
    // contains all the letters from
    // a to z (ignoring case)

public static void allLetters(String str)
{
    str = str.toLowerCase();

    boolean allLetterPresent = true;

    for(char ch='a';ch<='z';ch++)
    {
        if (!str.contains(String.valueOf(ch))) {  // returns the string value of ch
            allLetterPresent = false;
            break;
        }
    }

    if (allLetterPresent)
        System.out.println("String is Pangram");
    else
        System.out.println("String is Not a Pangram");
}

    public static void main(String args[])
    {
        String str = "The quick brown fox jumps over the lazy dog";
       // String str = "Abcdefghijklmnopqrstuvwxyz12";
        // Function call
        allLetters(str);
    }
}
