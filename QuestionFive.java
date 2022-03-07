import java.util.Scanner;
public class QuestionFive
{
    
    static float simpleInterest(int p, int r,int t){
        float sInterest = (p*r*t)/100;   
        return sInterest;
    }
    
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int p = sc.nextInt();
	    int r = sc.nextInt();
	    int t = sc.nextInt();
	    
	    
		System.out.println("Simple Interest is : "+simpleInterest(p,r,t));
	}
}
