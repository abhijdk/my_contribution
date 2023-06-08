package apr_12_2023_IOStream_with_exception_handling;

class Handling 
{
    public static void Nit(int param)
    {
        try 
        {
            System.out.println("Naresh");
            Nit1(param);
            System.out.println("I");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void Nit1(int param) throws Exception
    {
        try
        {
            int result = 100 / param;
            System.out.println("Completed");
        }
        catch (ArithmeticException e) 
        {
            throw new Exception("ArithmeticException caught");
        } finally {
            System.out.println("Finally");
        }
    }
}


public class Test01 {
    public static void main(String[] args) {
        int[] testCases = {0, 1, 10, 15};

        for (int i = 0; i < testCases.length; i++) {
            System.out.println("Test Case " + (i+1) + " with input " + testCases[i] + ":");
            Handling.Nit(testCases[i]);
            System.out.println();
        }
    }
}