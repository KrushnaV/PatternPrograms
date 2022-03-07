import java.util.Scanner;
public class QuestionFourteen
{
    static int isPerfect(int num)
    {
        int sum=0;
        for(int i=1; i <= num/2; i++)
        {
            if(num % i == 0)
            {
                // sum of factor
                sum=sum + i;
            }
        }

        return sum;
    }
    public static void main(String args[])
    {
        int n, s;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");

        n=sc.nextInt();

        s = isPerfect(n);

        if(s==n)
            System.out.println("perfect number");
        else
            System.out.println(" Not a perfect number");
    }
}
