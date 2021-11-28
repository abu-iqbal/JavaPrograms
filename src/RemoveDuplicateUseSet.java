import java.util.*;

public class RemoveDuplicateUseSet {
public static void removeDuplicate(int [] arr)
{
    Set<Integer> intSet = new HashSet<Integer>();

    for(int i=0;i<arr.length;i++)
    {
        intSet.add(arr[i]);
    }
    System.out.println(intSet);

}

    public static void main(String[] args) {
        int a[] = {5,2,5,9,8,1,2};
        removeDuplicate(a);
    }
}
