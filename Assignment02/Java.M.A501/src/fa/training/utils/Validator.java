package fa.training.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private static final String VALID_NUMBER_PHONE = "^(\\d{3}[- .]?){2}\\d{4}$";
    public static boolean validNumberPhone(String phoneNumber) {
        Pattern pattern = Pattern.compile(VALID_NUMBER_PHONE);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
    public static boolean validNumberOrder(String numberOrder) {
        if (numberOrder.length() == 10) {
            return true;
        }
        return false;
    }
}
