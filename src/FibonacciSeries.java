public class FibonacciSeries {


    public static void fibonacci(int count)
    {
 int num1 = 0;
 int num2=1;

 for(int i=1;i<=count;i++) {
     System.out.print(num1+" ");
     int num3 = num1+num2;

     num1 = num2;
     num2 = num3;

     }

    }

    public static void main(String[] args) {

        fibonacci(7);
    }
}
