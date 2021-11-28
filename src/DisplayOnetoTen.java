public class DisplayOnetoTen {

public static void printTenNumber(int n)
{
    if(n<=10)
    {
        System.out.println(n);
        printTenNumber(n+1);
    }
}

    public static void main(String[] args) {
        DisplayOnetoTen.printTenNumber(1);
    }
}
