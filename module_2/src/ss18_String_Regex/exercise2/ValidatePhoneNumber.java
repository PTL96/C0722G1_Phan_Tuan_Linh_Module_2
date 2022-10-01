package ss18_String_Regex.exercise2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static Pattern pattern;
    private static final String PHONENUMBER_REGEX = "[0][1-9]{9}";
    public ValidatePhoneNumber(){
        pattern = Pattern.compile(PHONENUMBER_REGEX);
    }
    public boolean validate(String regex){
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        ValidatePhoneNumber validatePhoneNumber = new ValidatePhoneNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số điện thoại: ");
        String phoneNumber = scanner.nextLine();
        boolean isvalid = validatePhoneNumber.validate(phoneNumber);
        System.out.println(phoneNumber +"\t"+ isvalid);
    }
}
