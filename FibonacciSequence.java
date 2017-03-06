/*
 Task 4
 Create recursion method that will calculate Fibonacci
 sequence, defined with element fibonacci(n) as a sum of
 fibonacci(n-1) + fibonacci(n-2) assuming that fibonacci(1)
 and fibonacci(2) has respectively value 1 and 2.
*/

public class FibonacciSequence
{
    public static int Fibo(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        else if(n == 1)
        {
            return 1;
        }
        else if(n == 2)
        {
            return 2;
        }
        else
        {
            n = Fibo(n-1) + Fibo(n-2);
            return n ;
        }

    }

    public static void main(String[] args)
    {
        for(int i = 1; i < 20; i++)
        {
            System.out.println(Fibo(i));
        }
    }
}

/*
output:
1
2
3
5
8
13
21
34
55
89
144
233
377
610
987
1597
2584
4181
6765
 */

