/*
 Task 2
 Create a simple method to check and
 display if the given word is a palindrome.
*/
public class Palindrome
{
    public static boolean isPalindrome(char[] palindrome)
    {
        int i = 0;
        int j = palindrome.length - 1;

        boolean pal = false;
        int countBool = 0;

        System.out.print("Word normally: " );
        for(int k = 0; k < palindrome.length; k++)
        {
            System.out.print(palindrome[k]);
        }

        System.out.print("\nWord from behind: " );
        for(int k = palindrome.length - 1; k >= 0; k--)
        {
            System.out.print( palindrome[k]);

        }

        System.out.println();
        for(i = i, j = j; i < palindrome.length && j >= 0; i++,j--)
        {
            if(palindrome[i] == palindrome[j])
            {
                pal = true;
                countBool++;
            }
        }

        if(pal && countBool == palindrome.length)
        {
            System.out.println("It is a palindrome!");
            pal = true;
        }
        else
        {
            System.out.println("It is not a palindrome");
            pal = false;
        }
        return pal;
    }

    public static void main(String[] args)
    {
        char[] palindrome = {'d','e','v','i','l',' ','l','i','v','e','d'};
        isPalindrome(palindrome);
    }

/*
output:
Word normally: devil lived
Word from behind: devil lived
It is a palindrome!
*/
}