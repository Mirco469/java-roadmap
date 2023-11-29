package net.ielpo.roadmap.util;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * @author Alberto Ielpo
 */
public class DateUtils {

    /**
     * @return isodate as 2023-11-28T11:11:12Z
     */
    public static String isoDate() {
        LocalDateTime ldt = LocalDateTime.now(ZoneId.of("UTC"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
        return ldt.format(formatter);
    }

    public static Long unixTimestamp() {
        return System.currentTimeMillis();
    }

}
