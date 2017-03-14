package EuclideanAlgorithm;

/*
 Create a program that will find
 random numbers from 0 to 100 and
 enumerate their greatest common divisor.
 Make a method that implements Euclid's
 algorithm.
 */

public class EuclideanAlgorithm
{
    public static int EuclideanAlg(int fNumber, int sNumber)
    {
        int modulo = 0;

        if(fNumber < sNumber)
        {
            int switchNumbers;
            switchNumbers = fNumber;
            fNumber = sNumber;
            sNumber = switchNumbers;
        }
        if(sNumber != 0)
        {
            modulo = fNumber % sNumber;
        }
        else if(sNumber == 0)
        {
            System.out.println("One of the numbers is 0");
            return 0;
        }
        if(modulo != 0)
        {
            fNumber = sNumber;
            sNumber = modulo;
            modulo = fNumber%sNumber;
            if(modulo == 0)
            {
                return sNumber;
            }
            else
            {
                return EuclideanAlg(fNumber, sNumber);
            }
        }
        else
        {
            return sNumber;
        }
    }
}