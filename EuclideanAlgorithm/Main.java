package EuclideanAlgorithm;

/*
 Create a program that will find a
 random numbers from 0 to 100 and
 enumerate their greatest common divisor.
 Make a method that implements Euclid's
 algorithm.
*/

public class Main
{
    public static void main(String[] args)
    {
        for(int i = 1; i <= 10; i++)
        {
            Pair pair = new Pair();
            System.out.println( i +"." + "GCD(" + pair.getFirstNumber()
                    + ", " + pair.getSecondNumber() + ") = " +
                    EuclideanAlgorithm.EuclideanAlg(pair.getFirstNumber(), pair.getSecondNumber()));
        }
    }
}

/* example of output:

1.GCD(16, 63) = 1
2.GCD(36, 81) = 9
3.GCD(50, 60) = 10
4.GCD(94, 5) = 1
5.GCD(31, 62) = 31
6.GCD(7, 51) = 1
7.GCD(85, 23) = 1
8.GCD(14, 81) = 1
9.GCD(20, 52) = 4
10.GCD(48, 83) = 1

*/
