import java.util.Scanner;

class pr
{
    public static void main(String[] args) {
        int a;
        int b;

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the A=");
        a=sc.nextInt();
        System.out.print("Enter The B=");
        b=sc.nextInt();

        if(a>b)
        {
            System.out.println("A is Big");
        }
        else
        {
            System.out.print("B is Big");
        }
    }
}