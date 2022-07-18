import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check {
    public static void main(String[] args) {
        System.out.println("Enter Paragraph");
        Scanner sc= new Scanner(System.in);
        int count=0;
        Pattern p=Pattern.compile("Java");
        Matcher m = p.matcher(sc.nextLine());

        while(m.find()) {
            count++;
            System.out.println(m.start() + "=======" + m.end() + "==========" + m.group());
        }
        System.out.println("occurnce is "+count);

    }
}
