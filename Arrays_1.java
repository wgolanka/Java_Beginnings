/*
 Task 1
 Create three arrays of type int and random size.
 Fill each with random values. Then create an array
 Containing arrays that were created earlier.
 Display all of the values using an array that contain them.
*/

public class Arrays_1
{
    public static void main(String[] args)
    {
        int[] firstAr = new int[(int)(Math.random()*10)];
        int[] secAr = new int[(int)(Math.random()*10)];
        int[] thirdAr = new int[(int)(Math.random()*10)];
        int[][] sharedAr = {firstAr, secAr, thirdAr};

        System.out.println("First array: ");
        for(int i = 0; i < firstAr.length; i++)
        {
            firstAr[i] = (int)(Math.random()*10);
            System.out.print(firstAr[i] + " ");
        }

        System.out.println("\nSecond array: ");
        for(int i = 0; i < secAr.length; i++)
        {
            secAr[i] = (int)(Math.random()*10);
            System.out.print(secAr[i] + " ");
        }

        System.out.println("\nThird array: ");
        for(int i = 0; i < thirdAr.length; i++)
        {
            thirdAr[i] = (int)(Math.random()*10);
            System.out.print(thirdAr[i] + " ");
        }

        System.out.println("\nShared array: ");
        for(int i = 0; i < sharedAr.length; i++)
        {
            System.out.println();
            for(int j = 0; j < sharedAr[i].length; j++)
            {
                System.out.print(sharedAr[i][j]  + " ");
            }
        }
    }
}
/*
Example output:

First array:
6 3 8 0 1 0 4 9

Second array:
3 5 6 6 7 5

Third array:
5 1 3 2 3

Shared array:
6 3 8 0 1 0 4 9
3 5 6 6 7 5
5 1 3 2 3
*/