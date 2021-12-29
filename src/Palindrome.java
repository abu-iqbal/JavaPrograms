public class Palindrome {

    public static boolean isPalindrome(String str)
    {
       char[] charArray = str.toCharArray();
       int start =0;
       int end = str.length()-1;
       while(start<end)
       {
           if(charArray[start]!=charArray[end])
           {
               return false;
           }
           start++;
           end--;
       }
       return true;
    }

    public static void main(String[] args) {
        String str = "MUMBAI";
        if(isPalindrome(str))
        {
            System.out.println("The given string is Palindrome");
        }
        else
        {
            System.out.println("The given string is not Palindrome");
        }
    }
}
