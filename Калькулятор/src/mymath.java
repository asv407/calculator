public class mymath
{
    public static long gcd(long a, long b)
    {
        if(b == 1)
        {
            return 1;
        }
        if(b == 0)
        {
            return a;
        }
        return gcd(b, a % b);
    }
    public static double Sqrt(double x)
    {
        double a = 1;
        for (int i = 0; i < 100; i++)
        {
            a = (a + x / a) / 2;
        }
        return a;
    }

}
