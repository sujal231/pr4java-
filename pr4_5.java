import java.util.Scanner;

class pr{

    public static void main(String[] args) {
        ss i =new ss();
        ss.math t =i.new math();
        t.factorial();
    }
}
class ss
{
    class math
    {
        void factorial()
        {
            int f=1;
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Number=");
            n=sc.nextInt();
            for (int i = 1; i <=n; i++) {
                f=f*i;  
                
            }
            System.out.println("Factorial= "+f);

        }
    }
}