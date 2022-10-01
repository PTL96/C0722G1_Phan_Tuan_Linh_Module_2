package ss18_String_Regex.exercise1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    private static Pattern pattern;
    private static final String CLASSNAME_REGEX = "[CAP][\\d]{4}[GHIKLM]";
public ValidateClassName(){
    pattern = Pattern.compile(CLASSNAME_REGEX);
}
public boolean validate(String regex){
    Matcher matcher = pattern.matcher(regex);
    return matcher.matches();
}

    public static void main(String[] args) {
        ValidateClassName validateClassName = new ValidateClassName();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên lớp");
        String validateClass = scanner.nextLine();
        boolean isvalid = validateClassName.validate(validateClass);
        System.out.println(validateClass +"\t"+ isvalid);
    }
}
