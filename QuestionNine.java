import java.util.Scanner;
class QuestionNine {
//  static function to get value
	static int getFact(int n)
	{
// 	    if number is  0 or 1 returns 1
		if (n == 0 || n == 1)
			return 1;

		return n * getFact(n - 1);
	}

	public static void main(String[] args)
	{
//      passing value to getFact method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
		int fact = getFact(n);

		System.out.println("Factorial is : " + fact);
	}
}

