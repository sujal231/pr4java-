import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class pr{
    public static void main(String[] args) {
        int s;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the s:-");
        s=sc.nextInt();
        if(s>0)
        {
            System.out.println("positive");
        }
        else if (s<0) {
            System.out.println("negative");
        }
        else
        {
            System.out.println("Zero");
        }
    }

}