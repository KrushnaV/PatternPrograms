import java. util. Arrays;
class QuestionThirteen{

    public static boolean isFibonacci(int arr[],
    									int n)
    {
        // checking if size of array is one or two
    	if (n == 1 || n == 2)
    		return true;

    // 	sorting method
    	Arrays.sort(arr);

    // 	check number is equal to sum of previous 2 element
    	for(int i = 2; i < n; i++)
    	{
    	if ((arr[i - 1] + arr[i - 2]) != arr[i])
    		return false;
    	}
    	return true;
    }

    public static void main(String[] args)
    {
    	int arr[] = { 8, 3, 5, 13 };
    	int n = arr.length;

    	if (isFibonacci(arr, n))
    		System.out.println("Fibonacci series");
    	else
    		System.out.println("Not a Fibonacci series");
    }
}


