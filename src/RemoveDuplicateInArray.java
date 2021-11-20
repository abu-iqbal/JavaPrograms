import java.util.Arrays;

public class RemoveDuplicateInArray
{
    // By sorting the array first
    public static void main(String[] args)
    {
        int [] orgArr = {6, 7, 6, 8};

        int[] uniqArr = new int[orgArr.length];

        int counter=0;

        Arrays.sort(orgArr);

        for(int i=0;i<orgArr.length-1;i++)
        {
            if(orgArr[i]!=orgArr[i+1])
            {
    uniqArr[counter] = orgArr[i];   // Assign each unique value to the array till the penultimate number
    counter++;
            }
        }
uniqArr[counter] = orgArr[orgArr.length-1];   /// Assign the last or ultimate array value to UniqueArray
        System.out.println("Array with unique elements:- ");
        for(int i=0;i<=counter;i++)
        {
            System.out.println(uniqArr[i]);
        }
    }
}
