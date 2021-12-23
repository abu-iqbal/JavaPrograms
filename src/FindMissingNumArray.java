public class FindMissingNumArray {


    //Dinesh Varyani : Find the missing Number in Array
    public static int missNumInArray(int[] arr)
    {
        int n = arr.length+1;
        int sum = n*(n+1)/2; // This is formula to calculate the sum of given n ntaural numbers
        for(int num : arr)
        {
            sum = sum -num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};
        System.out.println("The missing number is:- "+missNumInArray(arr));
    }

}
