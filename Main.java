import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    Scanner ob=new Scanner(System.in);
    System.out.println("Enter the number you want to check:");
    int n=ob.nextInt();
    int flag=0;
    for(int i=0;i<=n/2;i++)
    {
        if(i%n==0)
        {
            flag=1;
        }
    }
    if(flag==0)
    {
        System.out.println(n+" is a prime number");
    }
    else
    {
        System.out.println(n+" is not a prime number");
    }
    }
}
