import org.apache.commons.lang.time.DateFormatUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;
import java.util.Date;
import java.util.TimeZone;

public class UTCDateTest {

    public static void main (String[] args) {
       /*// Date d = getUTCDate("2021-09-16 23:59:59.0");
        Date d = getUTCDate("2022-03-05 23:59:59");
       // Date d = getCurrentUtcTime();
        String format = DateFormatUtils.ISO_DATE_TIME_ZONE_FORMAT.format(d);
        System.out.println("***************** ssssssssssskuid " + d.toString());
        System.out.println("***************** ssssssssssskuid format" + d.toInstant().toString());
        System.out.println("***************** ssssssssssskuid formatvvvvv " + format);*/

        Instant instant = Instant.ofEpochMilli(1650625302000l);
        System.out.println(instant.atZone(ZoneId.systemDefault()).getYear());
        Long instantMilliSeconds = instant.toEpochMilli();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        //df.setTimeZone(TimeZone.getTimeZone("UTC"));
        System.out.println(df.format(new Date(instantMilliSeconds)));
        System.out.println(instantMilliSeconds);

    }
    public static Date getUTCDate(String dateString) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date = null;
        try {
            //date = formatter.parse(dateString);
            date = formatter.parse(dateString);
        } catch (Exception ex) {
            System.out.println("LLMProfileUtils.getDate() Unable to parse the string to date=");
        }
        return date;
    }

}

