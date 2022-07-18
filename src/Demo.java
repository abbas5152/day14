import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo extends  Citizen {

    public boolean validate(String name,String mobileNum,String aadharCard){
//       Scanner s= new Scanner(System.in);
//       setName(s.nextLine());
//       setAadharNumber(s.nextLine());
//       setMobileNumber(s.nextLine());
//        System.out.println(getAadharNumber());
        Pattern p1 = Pattern.compile("[a-zA-Z]{3,8}");
        Matcher m1 = p1.matcher(getName());
        Pattern p2 = Pattern.compile("\\d{12}");
        Matcher m2 = p2.matcher(getAadharNumber());
        Pattern p3 = Pattern.compile("[6789]\\d{9}");
        Matcher m3 = p3.matcher(getAadharNumber());



       if(m1.find() && m2.find() && m3.find()){
           return true;

       }
       else
           return false;



    }

    public static void main(String[] args) {
        Demo d1=new Demo();
        Scanner s= new Scanner(System.in);
        System.out.println("Enter name");
        d1.setName(s.next());
        System.out.println("Enter Adhar card");
        d1.setAadharNumber(s.next());
        System.out.println("Enter Mobile Number");
        d1.setMobileNumber(s.next());


       if(d1.validate(d1.getName(), d1.getAadharNumber(),d1.getMobileNumber())){
           System.out.println(d1.name);
           System.out.println(d1.aadharNumber);
           System.out.println(d1.mobileNumber);
       }
else{
           System.out.println("Enter valid data");
       }


    }
}

