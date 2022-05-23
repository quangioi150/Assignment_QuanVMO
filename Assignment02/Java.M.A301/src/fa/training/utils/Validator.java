package fa.training.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private static final String VALID_EMAIL = "^[a-zA-Z]+[a-z\\d]*@\\w+mail.com$";
    public static boolean validEmail(String email) {
        Pattern pattern = Pattern.compile(VALID_EMAIL);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public static boolean validGender(byte gender) {
        if (gender == 0 || gender == 1) {
            return true;
        }
        return false;
    }
}


