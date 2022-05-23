package fa.training.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static final SimpleDateFormat ddMMyyyy = new SimpleDateFormat("dd/MM/yyyy");

    public static Date convertStringToDate(String time) {
        try {
            return ddMMyyyy.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
