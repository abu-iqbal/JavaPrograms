public class MinValueInArray {

    public int minValue(int [] arr)
    {
        int min = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr ={5,19,25,3,1};
        MinValueInArray obj = new MinValueInArray();
        System.out.println("The minimum value in the array is :- "+obj.minValue(arr));
    }
}
