/** Task 3
 * Create random sized array and fill it with random
 * values. Then create a program that will double it
 * size and fill its first half with this array values
 * sorted low to high and the second half with the same
 * values but sorted high to low.
 */
public class Arrays_2
{
    public static int[] sortLowToHigh(int[] array)
    {
        int keepValue = 0;
        for(int i = 0; i < array.length - 1; i++)
        {
            for(int j = i+1; j < array.length; j++)
            {
                if(array[i] > array[j])
                {
                    keepValue = array[i];
                    array[i] = array[j];
                    array[j] = keepValue;
                }
            }
        }
        return array;
    }
    public static int[] sortHighToLow(int[] array)
    {
        int keepValue = 0;
        for(int i = 0; i < array.length - 1; i++)
        {
            for(int j = i+1; j < array.length; j++)
            {
                if(array[i] < array[j])
                {
                    keepValue = array[i];
                    array[i] = array[j];
                    array[j] = keepValue;
                }
            }
        }
        return array;
    }
    public static int[] displayArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        return array;

    }
    public static void main(String[] args)
    {
        int[] array = new int[(int)(Math.random()*20 + 5)];
        System.out.println("Array with random length and fill:");
        for(int i = 0; i < array.length; i++)
        {
            array[i] = (int)(Math.random()*10);
        }
        displayArray(array);
        System.out.println();

        int[] doubledArray = new int[2*array.length];

//		Filling and sorting the first half of array:
        sortLowToHigh(array);
        for(int i = 0; i < doubledArray.length /2; i++)
        {
            doubledArray[i] = array[i];
        }

//		Filling and sorting the second half of array
        sortHighToLow(array);
        System.out.println("\nDoubled and sorted array ");
        for(int i = doubledArray.length/2, j = 0 ;
            i < doubledArray.length && j < array.length; i++, j++)
        {
            doubledArray[i] = array[j];
        }
        displayArray(doubledArray);
    }
}
/*
Example of output:
Array with random length and fill:
4 6 5 2 0 2 5 9 8 6 7 9 0 3 9 0 5 7 7

Doubled and sorted array
0 0 0 2 2 3 4 5 5 5 6 6 7 7 7 8 9 9 9 9 9 9 8 7 7 7 6 6 5 5 5 4 3 2 2 0 0 0
 */