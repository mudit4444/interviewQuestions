import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;

public class RomantoInteger {

    private final static Logger log = Logger.getLogger(RomantoInteger.class.getName());

    public static void main(String[] args) {
        log.info("Requesting the string in roman");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string in roman " );
        String s = sc.nextLine();
        log.info("String is as follows " +s);

        log.info("Enter into the method from main method");
        int res = convertingRomantoInteger(s);
        System.out.println("the result is "  +res);
    }

    public static int convertingRomantoInteger(String s) {

        Map<String , Integer> roman = new HashMap<>();

        roman.put("I" , 1);
        roman.put("V" , 5);
        roman.put("X" , 10);
        roman.put("L" , 50);
        roman.put("C" , 100);
        roman.put("D" , 500);
        roman.put("M" , 1000);
        int result = 0;

        for(int i = 0 ; i < s.length() ; i++) {
            if(i > 0 && roman.get(s.charAt(i)) > roman.get(s.charAt(i-1))) {
                result += roman.get(s.charAt(i)) - 2* roman.get(s.charAt(i-1));
            }
            else {
                result += roman.get(s.charAt(i));
            }
        }
        return result;
    }
}
