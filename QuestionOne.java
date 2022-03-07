public class QuestionOne{
    public static void main(String args[]) {

    int n=5,result=0;

    int a[]=new int[5];
    a[0]=10;
    a[1]=20;
    a[2]=30;
    a[3]=40;
    a[4]=50;

    for(int i=0;i<n;i++)
    result=result+a[i];

    System.out.println("The Average is ="+result/n);
}
