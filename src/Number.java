import java.util.Scanner;

public class Number {

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        try {
            String n = s1.next();
            int n1 = Integer.parseInt(n);
            System.out.println(n1*n1);
        }
        catch(NumberFormatException nfe){
            System.out.println("Enter a proper number");
        }


    }
}
