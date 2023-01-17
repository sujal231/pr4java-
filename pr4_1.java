import java.util.Scanner;

class print{
    public static void main(String[] args) {
    String z;
    int s;
    double t;
    float u;
    char v;
    long w;
   
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter The String=");
    z = sc.nextLine();

    System.out.print("Enter The Numbar=");
    s=sc.nextInt();

    System.out.print("Enter The Numbar=");
    t=sc.nextDouble();

    System.out.print("Enter The Numbar=");
    u=sc.nextFloat();

    System.out.print("Enter The char=");
    v=sc.next().charAt(0);

    System.out.print("Enter The numbar=");
    w=sc.nextLong();


    System.out.println("Z ="+z);
    System.out.println("S ="+s);
    System.out.println("T ="+t);
    System.out.println("U ="+u);
    System.out.println("V ="+v);
    System.out.println("W ="+w);

    }
}