/*
 Show which is faster StringBuilder or StringBuffer.
*/

public class StringBufferVSBuilder
{
    public static void main(String[] args)
    {
        String s = "a";
        long startBuffer = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer(s);

        for(int i = 0; i < 1000000; i++)
        {
            stringBuffer.append("bcd");
        }

        long stopBuffer = System.currentTimeMillis() - startBuffer;
        System.out.println("StringBuffer did 1000000 loops in " + stopBuffer + " ms.");

        long startBuilder = System.currentTimeMillis();

        StringBuilder stringBuilder = new StringBuilder(s);

        for(int i = 0; i < 1000000; i++)
        {
            stringBuilder.append("bcd");
        }

        long stopBuilder = System.currentTimeMillis() - startBuilder;
        System.out.println("StringBuilder did 1000000 loops in " + stopBuilder + " ms.");
    }
}

/* output:

StringBuffer did 1000000 loops in 66 ms.
StringBuilder did 1000000 loops in 32 ms.

*/