import java.util.Scanner;
class QuestionFour{

    private static boolean isPrime(int n){

       boolean flag = true;
        for(int i=2; i<(n/2); i++){
            if(n%i == 0){
                //If n is divisible by i, it is not Prime.
                flag = false;
                break;
            }
        }
        return flag;

    }




    public static void main(String args[]){

       Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        //pass the number to the function
        if(isPrime(n)){
            System.out.println("It's Prime");
        } else {
            System.out.println("Not Prime");
        }

    }

}
