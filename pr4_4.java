import java.util.Scanner;

class pr {
    public static void main(String[] args) {
     int a,b,c;

     Scanner sc =new Scanner(System.in);

     System.out.print("Enter a=");
     a=sc.nextInt();

     System.out.print("Enter b=");
     b=sc.nextInt();

     System.out.print("Enter c=");
     c=sc.nextInt();


    if (a<b) {
        if (a<c) {
            System.out.print("a is Smallest");
        } else {
            System.out.print("c is Smallest");
        }
        
    }
    else {
        if (b<c) {
            System.out.print("b is Smallest");
            
        } else {
            System.out.print("c is Smallest");
        }
        
    }
        
    

    }
}