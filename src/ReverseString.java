public class ReverseString {


    // using toCharArray
    public static void main(String[] args) {
        String s1 = "Programming";
        char[] resultArray = s1.toCharArray();
    for(int i =resultArray.length-1;i>=0;i--)
    {
        System.out.print(resultArray[i]);
    }
    }
    //https://www.simplilearn.com/tutorials/java-tutorial/reverse-a-string-in-java
}
