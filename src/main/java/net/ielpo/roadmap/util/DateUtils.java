package net.ielpo.roadmap.util;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * @author Alberto Ielpo
 */
public class DateUtils {

    private static DateTimeFormatter isoFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'")
            .withZone(ZoneId.of("UTC"));

    /**
     * @return isodate as 2023-11-28T11:11:12Z
     */
    public static String isoDate() {
        LocalDateTime ldt = LocalDateTime.now(ZoneId.of("UTC"));
        return ldt.format(DateUtils.isoFormatter);
    }

    public static Long unixTimestamp() {
        return System.currentTimeMillis();
    }

    public static LocalDateTime isoDateIntoLocalDateTime(String isoDate) {
        return LocalDateTime.parse(isoDate, DateUtils.isoFormatter);
    }

    public static LocalDateTime unixMilliIntoLocalDateTime(Long unixTimestamp) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(unixTimestamp), ZoneId.of("UTC"));
    }
}
