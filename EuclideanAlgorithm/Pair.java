package EuclideanAlgorithm;

/*
 Create a program that will find a
 random numbers from 0 to 100 and
 enumerate their greatest common divisor.
 Make a method that implements Euclid's
 algorithm.
*/

public class Pair
{
    private int firstNumber;
    private int secondNumber;

    public Pair()
    {
        firstNumber = (int)(Math.random()*101);
        secondNumber = (int)(Math.random()*101);
    }

    int getFirstNumber()
    {
        return firstNumber;
    }
    int getSecondNumber()
    {
        return secondNumber;
    }

    public Pair getPair()
    {
        Pair pair = new Pair();
        pair.firstNumber = firstNumber;
        pair.secondNumber = secondNumber;

        return pair;
    }
}
