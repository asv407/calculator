import java.util.Scanner;

public class st
{

    //public static double Sqrt()
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double a = 0, b = 0;
        System.out.println("Введите сначала тип арифметической операции, затем на следующей строке два числа\n Чтобы закончить работу введите #");
        double a1[], b1[];
        String s2[];
        a1 = new double[100000];
        b1 = new double[100000];
        s2 = new String[100000];
        int ii = 0;
        while(true)
        {
            String s;
            s = scanner.next();
            String s1;
            s1 = s.replaceAll(" ", "");
            if(s1.equals("sqrt"))
            {
                a = scanner.nextDouble();
                System.out.println(mymath.Sqrt(a));
                ii++;
                a1[ii] = a;
                s2[ii] = s1;
                continue;
            }
            if(s1.equals("h"))
            {
                for (int j = 0; j < ii; j++)
                {
                    if (s2[j].equals("NOD"))
                    {
                        System.out.print("NOD(");
                        System.out.print(a + ";" + b + ')');
                        continue;
                    }
                    if (s2[j].equals("NOK"))
                    {
                        System.out.print("NOK(");
                        System.out.print(a + ";" + b + ')');
                        continue;
                    }
                    if (s2[j].equals("sqrt"))
                    {
                        System.out.print("sqrt(");
                        System.out.print(a + ')');
                        continue;
                    }
                    System.out.print(a1[j] + " ");
                    System.out.print(s2[j] + " ");
                    System.out.print(b1[j] + "\n");
                }
                continue;
            }
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            a1[ii] = a;
            b1[ii] = b;
            s2[ii] = s1;
            if(s1.equals("+"))
            {
                System.out.println(a + b);
            }

            if(s1.equals("-"))
            {
                System.out.println(a - b);
            }
            if(s1.equals("*"))
            {
                System.out.println(a * b);
            }
            if(s1.equals("/"))
            {
                System.out.println(a / b);
            }
            if(s1.equals("%"))
            {
                System.out.println(a % b);
            }
            if(s1.equals("NOD"))
            {
                System.out.println(mymath.gcd((long) a, (long)b));
            }
            if(s1.equals("NOK"))
            {
                System.out.println(a * b / mymath.gcd((long) a, (long)b));
            }
            if(s1.equals("^"))
            {
                if(b == 0)
                {
                    System.out.println(1);
                    continue;
                }
                double df = a;
                for (int i = 1;  i < b; i++)
                {
                    a *= df;
                }
                System.out.println(a);

            }

            if(s1.equals("#"))
            {
                break;
            }
            ii++;
        }
    }



}